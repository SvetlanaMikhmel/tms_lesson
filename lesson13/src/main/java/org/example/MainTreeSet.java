package org.example;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
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

        Set<Worker> workers = new TreeSet<>();
        workers.add(director1);
        workers.add(director2);
        workers.add(director3);
        workers.add(director4);
        workers.add(engineer1);
        workers.add(engineer2);
        workers.add(engineer3);
        workers.add(engineer4);
        workers.add(engineer5);
        workers.add(engineer6);
        workers.add(engineer7);
        workers.add(engineer8);
        workers.add(engineer9);
        for (Worker worker : workers) {
            System.out.println(worker.getFirstName() + ": " + worker.getSalary());

        }
    }
}
