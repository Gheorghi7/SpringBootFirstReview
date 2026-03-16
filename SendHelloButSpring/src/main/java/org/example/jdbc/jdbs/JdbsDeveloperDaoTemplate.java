package org.example.jdbc.jdbs;

import org.example.jdbc.DeveloperDao;
import org.example.jdbc.model.Developer;
import org.example.jdbc.util.DeveloperMapped;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbsDeveloperDaoTemplate implements DeveloperDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createDeveloper(String name, String specialty, Integer experience) {
        String sqlInsert = "INSERT INTO developers (name, specialty, experience) VALUES(?, ?, ?)";
        jdbcTemplate.update(sqlInsert, name, specialty, experience);
        System.out.println("Developer has been created with name %s, specialty %s,  experience %d".
                formatted(name, specialty, experience));

    }

    @Override
    public Developer getDeveloper(Integer id) {
        String SQL = "SELECT * FROM DEVELOPERS WHERE id = ?";
        Developer developer = (Developer) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new DeveloperMapped());
        return developer;
    }

    @Override
    public List listDevelopers() {
        String SQL = "SELECT * FROM DEVELOPERS";
        List developers = jdbcTemplate.query(SQL, new DeveloperMapped());
        return developers;
    }

    @Override
    public void updateDeveloper(Integer id, String name, String specialty, Integer experience) {
        String SQL = "UPDATE DEVELOPERS SET name = ?, specialty = ?, experience = ? WHERE id = ?";
        jdbcTemplate.update(SQL, name, specialty, experience, id);
        System.out.println("Developer with id: " + id + " successfully updated.");
    }

    @Override
    public void removeDeveloper(Integer id) {
        String SQL = "DELETE FROM DEVELOPERS WHERE id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Developer with id: " + id + " successfully removed");
    }
}
