package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StudentService implements TableService<Students> {

    @Override
    public void insert(Students students) {
        try (Connection connection = DSUtils.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into students (id, firstName, lastName, age, gender_man,city_id) values (?,?,?,?,?,?)");
            preparedStatement.setInt(1, students.getId());
            preparedStatement.setString(2, students.getFirstName());
            preparedStatement.setString(3, students.getLastName());
            preparedStatement.setInt(4, students.getAge());
            preparedStatement.setBoolean(5, students.isGender_man());
            preparedStatement.setInt(6, students.getCity_id());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            System.out.println("InsertStError");
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DSUtils.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement1 = connection.prepareStatement("update students set city_id = null where city_id = " + id);
            preparedStatement1.executeUpdate();
            PreparedStatement preparedStatement2 = connection.prepareStatement("delete from students where  id = ?");
            preparedStatement2.setInt(1, id);
            preparedStatement2.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            System.out.println("DeleteStError");
        }

    }
}
