package org.example.jdbcTest1.doctorApp.DAO;

import org.example.jdbcTest1.doctorApp.Doctor;

import java.util.List;

public interface DoctorJdbcCRUDDao {

     void createDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(int id);

    List<Doctor> getDoctors();
}
