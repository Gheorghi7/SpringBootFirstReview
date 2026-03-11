package org.example.aopAnnotation;

public class Developer {
    private String name;
    private String specialty;
    private String experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void throwSomeMysticException() {
        System.out.println("SomeMysticException");
        throw new ClassCastException();
    }

    @Override
    public String toString() {
        return "Logging{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
