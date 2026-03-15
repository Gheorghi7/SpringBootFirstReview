package org.example.jdbs;

import org.example.jdbs.model.Developer;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDao {

    void setDataSource(DataSource dataSource);

    void createDeveloper(String name, String specialty, Integer experience);

    Developer getDeveloper(Integer id);

    List listDevelopers();

    void updateDeveloper(Integer id, String name, String specialty, Integer experience);

    void removeDeveloper(Integer id);
}
