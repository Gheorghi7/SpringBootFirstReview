package org.example.jdbcTest1.doctorApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.xml.transform.Source;

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
        jdbcConnection.insertInTable("Artiom", 00001L, "Proctologist", 300);
        jdbcConnection.insertInTable("Artiom", 00002L, "Proctologist", 257);
        jdbcConnection.insertInTable("Artiom", 00003L, "Proctologist", 189);
        jdbcConnection.insertInTable("Den", 00004L, "Proctologist", 430);
        jdbcConnection.insertInTable("Roma", 00005L, "Proctologist", 250);
        System.out.println("Inserted into doctor table");
        jdbcConnection.getTableContent().forEach(x -> System.out.println(x));
    }
}
