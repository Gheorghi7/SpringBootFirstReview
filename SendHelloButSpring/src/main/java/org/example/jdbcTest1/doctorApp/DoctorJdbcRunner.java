package org.example.jdbcTest1.doctorApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorJdbcRunner implements CommandLineRunner {
    private final JdbcConnection jdbcConnection;

    public DoctorJdbcRunner(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }


    public static void main(String[] args) {
        SpringApplication.run(DoctorJdbcRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        jdbcConnection.insertInTable("Artiom", 1L, "Proctologist", 300);
        jdbcConnection.insertInTable("Artiom", 2L, "Proctologist", 257);
        jdbcConnection.insertInTable("Artiom", 3L, "Proctologist", 189);
        jdbcConnection.insertInTable("Den", 4L, "Proctologist", 430);
        jdbcConnection.insertInTable("Roma", 5L, "Proctologist", 250);
        System.out.println("Inserted into doctor table");
        for (var i : jdbcConnection.getTableContent()) {
            System.out.println("this is "+i);
        }
    }
}
