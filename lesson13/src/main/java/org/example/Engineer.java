package org.example;

public class Engineer extends Worker {
    public Engineer(String firstName, String lastName, Gender gender, int experience, Position.PositionType positionType) {
        super(firstName, lastName, gender, experience, positionType);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Engineer{} " + super.toString();
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }
}





