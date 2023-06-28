package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Sveta", "Mikhmel", Gender.MALE, 10, Position.PositionType.GENERAL, new ArrayList<>());
        Director director2 = new Director("Valera", "Mikhmel", Gender.FEMALE, 8, Position.PositionType.DEPARTMENT, new ArrayList<>());
        Director director3 = new Director("Kolya", "Mikhmel", Gender.MALE, 12, Position.PositionType.DEPARTMENT, new ArrayList<>());
        Director director4 = new Director("Natali", "Yuntsevich", Gender.FEMALE, 6, Position.PositionType.DEPARTMENT, new ArrayList<>());

        Engineer engineer1 = new Engineer("Tanya", "Yuntsevich", Gender.MALE, 5, Position.PositionType.AUTOMATOR);
        Engineer engineer2 = new Engineer("Vitya", "Yuntsevich", Gender.FEMALE, 3, Position.PositionType.ROBOTICS);
        Engineer engineer3 = new Engineer("Zhanna", "Mikhmel", Gender.MALE, 7, Position.PositionType.COMMUNICATION);
        Engineer engineer4 = new Engineer("Kostya", "Mikhmel", Gender.FEMALE, 4, Position.PositionType.AUTOMATOR);
        Engineer engineer5 = new Engineer("Nastya", "Yuntsevich", Gender.MALE, 9, Position.PositionType.COMMUNICATION);
        Engineer engineer6 = new Engineer("Dima", "Grigorovich", Gender.FEMALE, 2, Position.PositionType.ROBOTICS);
        Engineer engineer7 = new Engineer("Artem", "Balasanyan", Gender.MALE, 6, Position.PositionType.AUTOMATOR);
        Engineer engineer8 = new Engineer("Anna", "Balasanyan", Gender.FEMALE, 8, Position.PositionType.COMMUNICATION);
        Engineer engineer9 = new Engineer("Lena", "Shugalskaya", Gender.MALE, 4, Position.PositionType.ROBOTICS);

        director1.addSubordinate(director2);
        director1.addSubordinate(director3);
        director1.addSubordinate(engineer1);
        director1.addSubordinate(engineer2);

        director2.addSubordinate(engineer3);
        director2.addSubordinate(engineer4);

        director3.addSubordinate(engineer5);
        director3.addSubordinate(engineer6);
        director3.addSubordinate(director4);

        director4.addSubordinate(engineer7);
        director4.addSubordinate(engineer8);
        director4.addSubordinate(engineer9);

        System.out.println("Salary of " + director1.getFirstName() + ": " + director1.getSalary());
        System.out.println("Salary of " + engineer1.getFirstName() + ": " + engineer1.getSalary());

        System.out.println("Does " + director1.getFirstName() + " have subordinate Tanya? " + DirectorService.hasSubordinate(director1, "Anna"));
        System.out.println("Does " + director2.getFirstName() + " have subordinate Dima? " + DirectorService.hasSubordinate(director2, "Lena"));

        System.out.println(director1.toString());

    }
}