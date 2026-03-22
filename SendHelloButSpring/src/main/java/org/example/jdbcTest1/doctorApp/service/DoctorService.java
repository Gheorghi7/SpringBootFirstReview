package org.example.jdbcTest1.doctorApp.service;

import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.DTO.DoctorDTO;
import org.example.jdbcTest1.doctorApp.DTO.DoctorNewDTO;
import org.example.jdbcTest1.doctorApp.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DoctorService {


    private final JdbcConnectionWithDao jdbcConnection;

    public DoctorService(JdbcConnectionWithDao jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public List<DoctorNewDTO> getAllDoctorsByID() {
        return jdbcConnection.getDoctors().stream()
                .map(f -> new DoctorNewDTO(
                        f.getId(),
                        "%s %s %d%n".formatted(
                                f.getDoctorName(),
                                f.getReferral(),
                                f.getPrice()
                        )
                ))
                .toList();
    }
}

