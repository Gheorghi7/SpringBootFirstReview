package org.example.jdbcTest1.doctorApp.DAO;

import org.example.jdbcTest1.doctorApp.Doctor;

import java.util.List;

public interface DoctorJdbcCRUD {

     void createDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(int id);

    List<List> getDoctors();
}
