package org.example.jdbcTest1.doctorApp.DAO;

import org.example.jdbcTest1.doctorApp.DTO.DoctorDTO;
import org.example.jdbcTest1.doctorApp.Doctor;
import org.example.jdbcTest1.doctorApp.DoctorMapped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@Service
public class JdbcConnectionDAO implements DoctorJdbcCRUD {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    private static final String SQL_CREATE_DOCTOR = """
            INSERT INTO doctor (doctorName, doctorIdentityCode, referral, price)
            VALUES(?, ?, ?, ?)
            """;
    private static final String SQL_UPDATE_DOCTOR = """
                    UPDATE doctor
                    SET doctorName = ?, doctorIdentityCode = ?,
                        referral = ?, price = ?
                    WHERE id = ?
            """;
    private static final String SQL_DELETE_DOCTOR = """
                    DELETE FROM doctor
                    WHERE id = ?
            """;
    private static final String SQL_SELECT_DOCTOR = """
                    SELECT id, doctorName, doctorIdentityCode, referral, price 
                    FROM doctor
            """;


    @Autowired
    public JdbcConnectionDAO(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public  void createDoctor(Doctor doctor) {
        jdbcTemplate.update(SQL_CREATE_DOCTOR, doctor.getDoctorName(),
                doctor.getDoctorIdentityCode(),
                doctor.getReferral(),
                doctor.getPrice());
        System.out.println("Doctor created successfully");
    }

    public List findByParameters(DoctorDTO doctorDTO) {
        List<Object> parameters = new ArrayList<>();
        List<Object> whereParameters = new ArrayList<>();
        if (doctorDTO.doctorName() != null) {
            parameters.add(doctorDTO.doctorName());
            whereParameters.add("doctorName = ?");
        }

        if (doctorDTO.doctorIdentityCode() != 0) {
            parameters.add(doctorDTO.doctorIdentityCode());
            whereParameters.add("doctorIdentityCode like ?");
        }
        String whereClause = "";
        if (!whereParameters.isEmpty()) {
            StringJoiner joiner = new StringJoiner(" AND ", " WHERE ", "");
            for (var whereParameter : whereParameters) {
                joiner.add(whereParameter.toString());
            }
            whereClause = joiner.toString();

        }
        parameters.add(doctorDTO.limit());
        parameters.add(doctorDTO.offset());

        List list = jdbcTemplate.query(SQL_SELECT_DOCTOR + whereClause + " LIMIT ? OFFSET ?",
                ps -> {
                    for (int i = 0; i < parameters.size(); i++) {
                        ps.setObject(i + 1, parameters.get(i));

                    }
                }, new DoctorMapped());
        return list;
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        jdbcTemplate.update(SQL_UPDATE_DOCTOR, doctor.getId(),
                doctor.getDoctorName(),
                doctor.getDoctorIdentityCode(),
                doctor.getReferral(),
                doctor.getPrice());
        System.out.println("Doctor updated successfully");
    }

    @Override
    public void deleteDoctor(int id) {
        jdbcTemplate.update(SQL_DELETE_DOCTOR, id);
        System.out.println("Doctor deleted successfully");
    }

    @Override
    public List getDoctors() {
        List query = jdbcTemplate.query(SQL_SELECT_DOCTOR, new DoctorMapped());
        return query;

    }
}
