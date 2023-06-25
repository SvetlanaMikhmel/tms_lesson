package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Sveta", "Sveta", 25, Gender.FEMALE, new ArrayList<>());
        Person person2 = new Person("Valera", "Valera", 30, Gender.MALE, new ArrayList<>());
        Person person3 = new Person("Kolya", "Kolya", 24, Gender.MALE, new ArrayList<>());
        Person person4 = new Person("Alena", "Alena", 49, Gender.FEMALE, new ArrayList<>());
        Person person5 = new Person("Tanya", "Tanya", 48, Gender.FEMALE, new ArrayList<>());
        people.add(person1);
        Child child1 = new Child("Mark", 2, Gender.MALE);
        Child child2 = new Child("Lia", 4, Gender.FEMALE);
        person1.addChild(child1);
        person1.addChild(child2);
        people.add(person2);
        Child child3 = new Child("Nikita", 6, Gender.MALE);
        Child child4 = new Child("Mia", 10, Gender.FEMALE);
        Child child5 = new Child("Filip", 5, Gender.MALE);
        Child child6 = new Child("Anna", 1, Gender.FEMALE);
        person2.addChild(child3);
        person2.addChild(child4);
        person2.addChild(child5);
        person2.addChild(child6);
        people.add(person3);
        Child child7 = new Child("Dima", 2, Gender.MALE);
        Child child8 = new Child("Maya", 3, Gender.FEMALE);
        Child child9 = new Child("Denis", 4, Gender.MALE);
        person3.addChild(child7);
        person3.addChild(child8);
        person3.addChild(child9);
        people.add(person4);
        Child child10 = new Child("Sveta", 25, Gender.FEMALE);
        person4.addChild(child10);
        people.add(person5);
        Child child11 = new Child("Nastya", 20, Gender.FEMALE);
        Child child12 = new Child("Oleg", 10, Gender.MALE);
        person5.addChild(child11);
        person5.addChild(child12);

        List<Person> gender = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        System.out.println(gender);

        List<Person> countOfChildren = people.stream()
                .filter(person -> person.getChildList().size() > 2)
                .collect(Collectors.toList());
        System.out.println(countOfChildren);

        List<String> age = people.stream()
                .flatMap(person -> person.getChildList().stream())
                .filter(child -> child.getAge() < 6)
                .map(Child::getName)
                .collect(Collectors.toList());
        System.out.println(age);

        List<Person> gender2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.filtering(person -> person.getChildList().stream()
                        .allMatch(child -> child.getAge() < 12), Collectors.toList()));
        System.out.println(gender2);

        List<Integer> age2 = people.stream()
                .flatMap(person -> person.getChildList().stream())
                .map(Child::getAge)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(age2);
    }
}