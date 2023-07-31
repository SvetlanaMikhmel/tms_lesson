package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CityService implements TableService<City> {
    @Override
    public void insert(City city) {
        try (Connection connection = DSUtils.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into city (id, name) values (?,?)");
            preparedStatement.setInt(1, city.getId());
            preparedStatement.setString(2, city.getName());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            System.out.println("InsertCityError");
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DSUtils.getConnection()) {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement1 = connection.prepareStatement("update students set city_id = null where city_id = " + id);
            preparedStatement1.executeUpdate();
            PreparedStatement preparedStatement2 = connection.prepareStatement("delete from city where  id = ?");
            preparedStatement2.setInt(1, id);
            preparedStatement2.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            System.out.println("DeleteCityError");
        }
    }
}
