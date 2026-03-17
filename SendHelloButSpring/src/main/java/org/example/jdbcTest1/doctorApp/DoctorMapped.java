package org.example.jdbcTest1.doctorApp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorMapped implements RowMapper {
    @Override
    public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Doctor doctor = new Doctor();
        doctor.setId(rs.getInt("id"));
        doctor.setDoctorName(rs.getString("doctorName"));
        doctor.setDoctorIdentityCode(rs.getLong("doctorIdentityCode"));
        doctor.setReferral(rs.getString("referral"));
        doctor.setPrice(rs.getInt("price"));
        return doctor;
    }

}
