package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Students {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private boolean gender_man;
    private Integer city_id;
    private List<City> cities;

    public Students(Integer id, String firstName, String lastName, Integer age, boolean gender_man, Integer city_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender_man = gender_man;
        this.city_id = city_id;
    }
}
