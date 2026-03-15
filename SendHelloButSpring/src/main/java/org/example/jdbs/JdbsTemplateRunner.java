package org.example.jdbs;


import org.example.jdbs.jdbs.JdbsDeveloperDaoTemplate;
import org.example.jdbs.model.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbsTemplateRunner {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("jdbstemplate-config.xml");
        JdbsDeveloperDaoTemplate template = (JdbsDeveloperDaoTemplate) context.getBean("jdbsDeveloperDaoTemplate");

        System.out.println("Creating developer");
        template.createDeveloper("Proselyte", "Java Developer", 3);
        template.createDeveloper("Petr", "C++ Developer", 2);
        template.createDeveloper("Asya", "C# Developer", 4);
        template.createDeveloper("Mary", "UI/UX designer", 1);

        System.out.println("Developer list");
        List list = template.listDevelopers();
        for (var developer : list) {
            System.out.println(developer);
        }

        System.out.println("Some changes to DB");
        template.updateDeveloper(2, "DesignerAnia", "UI developer", 2);
        template.removeDeveloper(3);

        System.out.println("Final list of developers");
        list = template.listDevelopers();
        for (var developer : list) {
            System.out.println(developer);
        }


    }
}
