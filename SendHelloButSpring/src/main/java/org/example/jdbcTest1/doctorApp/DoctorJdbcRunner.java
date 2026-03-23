package org.example.jdbcTest1.doctorApp;

import org.example.alternativeDoctorApp.Controller.DoctorController;
import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.DTO.DoctorDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorJdbcRunner  implements CommandLineRunner  {
    private final JdbcConnectionWithDao jdbcCon;

    public DoctorJdbcRunner(JdbcConnectionWithDao jdbcCon) {
        this.jdbcCon = jdbcCon;
    }


    public static void main(String[] args) {
        SpringApplication.run(DoctorJdbcRunner.class, args);



    }

    @Override
    public void run(String... args) throws Exception {


    }
}
