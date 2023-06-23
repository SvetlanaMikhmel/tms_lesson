package org.example;

public enum Position {
    DIRECTOR,
    ENGINEER;

    public enum PositionType {
        GENERAL(Position.DIRECTOR, 800),
        DEPARTMENT(Position.DIRECTOR, 600),
        AUTOMATOR(Position.ENGINEER, 400),
        ROBOTICS(Position.ENGINEER, 450),
        COMMUNICATION(Position.ENGINEER, 500);

        private Position position;
        private int coefficient;

        PositionType(Position position, int coefficient) {
            this.position = position;
            this.coefficient = coefficient;
        }

        public Position getPosition() {
            return position;
        }

        public int getCoefficient() {
            return coefficient;
        }
    }
}
