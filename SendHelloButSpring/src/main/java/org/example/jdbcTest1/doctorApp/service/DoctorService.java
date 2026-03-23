package org.example.jdbcTest1.doctorApp.service;

import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.DTO.DoctorDTO;
import org.example.jdbcTest1.doctorApp.DTO.DoctorNewDTO;
import org.example.jdbcTest1.doctorApp.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DoctorService {

    private final JdbcConnectionWithDao jdbcConnection;

    @Autowired
    public DoctorService(JdbcConnectionWithDao jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public List<DoctorNewDTO> getAllDoctorsByID() {
        return jdbcConnection.getDoctors().stream()
                .map(f -> new DoctorNewDTO(
                        f.getId(),
                        "%s %s %d".formatted(
                                f.getDoctorName(),
                                f.getReferral(),
                                f.getPrice()
                        )
                ))
                .toList();
    }
}

