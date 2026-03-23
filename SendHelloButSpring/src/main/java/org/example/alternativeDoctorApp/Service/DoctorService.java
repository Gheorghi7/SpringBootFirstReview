package org.example.alternativeDoctorApp.Service;

import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final JdbcConnectionWithDao jdbcConnection;

    public DoctorService(JdbcConnectionWithDao jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public List<Doctor> getAllDoctors() {
        return jdbcConnection.getDoctors();
    }

    public Doctor getDoctorById(int id) throws Throwable {
        return (Doctor) jdbcConnection.findByID(id).stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }
}
