package org.example.jdbcTest1.doctorApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
@Service
public class JdbcConnection {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public JdbcConnection(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate =  new JdbcTemplate(dataSource);
    }

    public void insertInTable(String doctorName,
                              Long doctorIdentityCode,
                              String referral,
                              int price) {

        String sqlQuery = "INSERT INTO doctor (doctorName, " +
                "doctorIdentityCode," +
                "referral, " +
                "price) values(?, ?, ?, ?)";

        jdbcTemplate.update(sqlQuery, doctorName, doctorIdentityCode, referral, price);

    }

    public List getTableContent() {
        String sqlQuery = "SELECT id, doctorName, doctorIdentityCode, referral, price FROM doctor";
        return jdbcTemplate.query(sqlQuery,
                new DoctorMapped());
    }


}
