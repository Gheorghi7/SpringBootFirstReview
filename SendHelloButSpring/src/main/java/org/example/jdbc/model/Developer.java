package org.example.jdbc.model;

public class Developer {

    private Integer id;
    private String name;
    private String specialty;
    private Integer experience;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String speciality) {
        this.specialty = speciality;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + specialty + '\'' +
                ", experience=" + experience +
                '}';
    }
}
