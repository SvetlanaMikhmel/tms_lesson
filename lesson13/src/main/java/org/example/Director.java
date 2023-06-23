package org.example;

import java.util.List;

public class Director extends Worker {

    private List<Worker> subordinates;

    public Director(String firstName, String lastName, Gender gender, int experience, Position.PositionType positionType, List<Worker> subordinates) {
        super(firstName, lastName, gender, experience, positionType);
        this.subordinates = subordinates;
    }

    @Override
    public int getSalary() {
        int baseSalary = super.getSalary();
        int bonus = subordinates.size() * 100;
        return baseSalary + bonus;
    }

    public void addSubordinate(Worker subordinate) {
        subordinates.add(subordinate);
    }

    public List<Worker> getSubordinates() {
        return subordinates;
    }

    public boolean hasSubordinate(String name) {
        for (Worker subordinate : subordinates) {
            if (subordinate.getFirstName().equals(name)) {
                return true;
            } else if (subordinate instanceof Director) {
                Director director = (Director) subordinate;
                if (director.hasSubordinate(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Director{" +
                "subordinates=" + subordinates +
                "} " + super.toString();
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }
}


