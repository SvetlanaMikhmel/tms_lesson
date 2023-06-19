package org.example;

public class Engineer extends Worker {
    public enum Specialization {
        AUTOMATION(400),
        ROBOTICS(450),
        COMMUNICATION(500);

        private int coefficient;

        Specialization(int coefficient) {
            this.coefficient = coefficient;
        }

        public int getCoefficient() {
            return coefficient;
        }
    }

    private Specialization specialization;

    public Engineer(String firstName, String lastName, Gender gender, int experience, Specialization specialization) {
        super(firstName, lastName, gender, experience);
        this.specialization = specialization;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public int getSalary(int coefficient) {
        return super.getSalary(coefficient);
    }

}
