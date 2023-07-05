package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String login;
    private String name;
    private int age;
    private Gender gender;
    private List<Child> childList = new ArrayList<>();

    public Person(String login, String name, int age, Gender gender, List<Child> childList) {
        this.login = login;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.childList = childList;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void addChild(Child child) {
        childList.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", childList=" + childList +
                '}';
    }
}
