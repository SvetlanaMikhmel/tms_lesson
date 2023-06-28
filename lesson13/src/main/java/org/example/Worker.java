package org.example;

public abstract class Worker implements Comparable {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int experience;
    private Position.PositionType positionType;

    public Worker(String firstName, String lastName, Gender gender, int experience, Position.PositionType positionType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.experience = experience;
        this.positionType = positionType;
    }

    public int getSalary() {
        return positionType.getCoefficient() * (experience + 1);
    }

    public String getFirstName() {
        return firstName;
    }

    public Position.PositionType getPositionType() {
        return positionType;
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

    @Override
    public int compareTo(Object o) {
        if (getSalary() == ((Worker) o).getSalary())
            if (firstName.equals(((Worker) o).firstName)) return 0;
        if (getSalary() > ((Worker) o).getSalary()) return -1;
        else return 1;
    }
}
