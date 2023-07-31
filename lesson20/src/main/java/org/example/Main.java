package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Driver driver = new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        StudentService studentService = new StudentService();
        studentService.insert(new Students(6, "Hanna", "Balasanyan", 25, false, 4));
        studentService.delete(6);
        studentService.insert(new Students(6, "Hanna", "Balasanyan", 25, false, 4));

        CityService cityService = new CityService();
        cityService.insert(new City(5, "Grodno"));
        cityService.delete(5);
        Connection connection = DSUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students");
        var students = new ArrayList<Students>();
        while (resultSet.next()) {
            var students_id = resultSet.getInt("id");
            var firstName = resultSet.getString("firstName");
            var lastName = resultSet.getString("lastName");
            var age = resultSet.getInt("age");
            var gender_man = resultSet.getBoolean("gender_man");
            var city_id = resultSet.getInt("city_id");
            Statement statementCity = connection.createStatement();
            ResultSet resultSetCity = statementCity.executeQuery("select * from city where id = " + city_id);
            List<City> cities = new ArrayList<>();
            while (resultSetCity.next()) {
                var cityId = resultSetCity.getInt("id");
                var name = resultSetCity.getString("name");
                var city = new City(cityId, name);
                cities.add(city);
            }
            var student = new Students(students_id, firstName, lastName, age, gender_man, city_id, cities);
            students.add(student);
            System.out.println(student);
        }


    }
}