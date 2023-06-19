package org.example;

public class Worker {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int experience;

    public Worker(String firstName, String lastName, Gender gender, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.experience = experience;
    }

    public int getSalary(int coefficient) {
        return coefficient * (experience + 1);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", experience=" + experience +
                '}';
    }
}
