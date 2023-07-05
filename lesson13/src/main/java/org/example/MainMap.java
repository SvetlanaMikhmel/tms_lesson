package org.example;

import java.util.*;

public class MainMap {
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
        Map<String, Worker> workerMap = new HashMap<>();
        workerMap.put(director1.getFirstName(), director1);
        workerMap.put(director2.getFirstName(), director2);
        workerMap.put(director3.getFirstName(), director3);
        workerMap.put(director4.getFirstName(), director4);
        workerMap.put(engineer1.getFirstName(), engineer1);
        workerMap.put(engineer2.getFirstName(), engineer2);
        workerMap.put(engineer3.getFirstName(), engineer3);
        workerMap.put(engineer4.getFirstName(), engineer4);
        workerMap.put(engineer5.getFirstName(), engineer5);
        workerMap.put(engineer6.getFirstName(), engineer6);
        workerMap.put(engineer7.getFirstName(), engineer7);
        workerMap.put(engineer8.getFirstName(), engineer8);
        workerMap.put(engineer9.getFirstName(), engineer9);
        int countOfDirector = 0;
        int countOfEngineer = 0;
        for (Map.Entry<String, Worker> entry : workerMap.entrySet()) {
            Worker value = entry.getValue();
            if (value.getPositionType().getPosition().equals(Position.DIRECTOR))
                countOfDirector++;
            if (value.getPositionType().getPosition().equals(Position.ENGINEER))
                countOfEngineer++;
        }
        System.out.println("В компании " + countOfDirector + " директора");
        System.out.println("В компании " + countOfEngineer + " инженеров");
    }
}
