package org.example.jdbcTest1.doctorApp.service;

import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.DTO.DoctorDTO;
import org.example.jdbcTest1.doctorApp.DTO.DoctorNewDTO;
import org.example.jdbcTest1.doctorApp.Doctor;

import java.util.List;
import java.util.stream.Collectors;

public class DoctorService {

    private static final DoctorService INSTANCE = new DoctorService();
    private final JdbcConnectionWithDao jdbcConnection = JdbcConnectionWithDao.getInstance();

    public List<DoctorNewDTO> getDoctorByID(){
        return jdbcConnection.getDoctors().stream()
                .map(f -> new DoctorNewDTO(f.getId(), "%s %s %s%n".formatted(f.getDoctorName(),f.getReferral() , f.getPrice())))
                .collect(Collectors.toList());
    }

    public static DoctorService getInstance() {
        return INSTANCE;
    }

    private DoctorService() {
    }
}
