package org.example.jdbcTest1.doctorApp;

import org.example.jdbcTest1.doctorApp.DAO.JdbcConnectionWithDao;
import org.example.jdbcTest1.doctorApp.DTO.DoctorDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorJdbcRunner implements CommandLineRunner {
    private final JdbcConnectionWithDao jdbcCon;

    public DoctorJdbcRunner(JdbcConnectionWithDao jdbcCon) {
        this.jdbcCon = jdbcCon;
    }


    public static void main(String[] args) {
        SpringApplication.run(DoctorJdbcRunner.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        jdbcCon.createDoctor(new Doctor("Artiom", 1l,
                "Proctologist", 300));
        jdbcCon.createDoctor(new Doctor("Artiom", 2l,
                "Proctologist", 200));
        jdbcCon.createDoctor(new Doctor("Artiom", 3l,
                "Proctologist", 500));
        jdbcCon.createDoctor(new Doctor("Artiom", 4l,
                "Proctologist", 140));
        jdbcCon.createDoctor(new Doctor("Artiom", 5l,
                "Proctologist", 200));

        DoctorDTO filter = new DoctorDTO("Artiom", 4L, 5, 0);
        System.out.println(jdbcCon.findByParameters(filter));


    }
}
