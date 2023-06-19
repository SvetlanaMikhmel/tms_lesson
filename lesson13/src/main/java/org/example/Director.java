package org.example;

import java.util.List;

public class Director extends Worker {
    public enum Position {
        GENERAL(800),
        DEPARTMENT(600);
        private int coefficient;

        Position(int coefficient) {
            this.coefficient = coefficient;
        }

        public int getCoefficient() {
            return coefficient;
        }
    }

    private Position position;


    private List<Worker> subordinates;

    public Director(String firstName, String lastName, Gender gender, int experience, Position position, List<Worker> subordinates) {
        super(firstName, lastName, gender, experience);
        this.position = position;
        this.subordinates = subordinates;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public int getSalary(int coefficient) {
        int baseSalary = super.getSalary(coefficient);
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
        return super.toString() + " Director{" +
                "position=" + position +
                ", subordinates=" + subordinates +
                "} ";
    }
}


