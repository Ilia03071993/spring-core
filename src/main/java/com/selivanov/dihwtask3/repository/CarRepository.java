package com.selivanov.dihwtask3.repository;

import com.selivanov.dihwtask3.bean.Car;
import com.selivanov.dihwtask3.bean.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarRepository {
    private JdbcConnection jdbcConnection;

    public List<Car> findAllCars() {
        try (Statement statement = jdbcConnection.getConnection().createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("select * from cars")) {
                List<Car> customerList = new ArrayList<>();
                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    String model = resultSet.getString("model");
                    BigDecimal price = resultSet.getBigDecimal("price");
                    String owner = resultSet.getString("owner");
                    Date year = resultSet.getDate("year");
                    customerList.add(new Car(id, model, price, owner, year));
                }
                return customerList;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addCar(Car car) {
        String sql = "insert into cars values (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = jdbcConnection.getConnection().prepareStatement(sql)) {
            statement.setInt(1, Types.NULL);
            statement.setString(2, car.getModel());
            statement.setBigDecimal(3, car.getPrice());
            statement.setString(4, car.getOwner());
            statement.setDate(5, car.getYear());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}