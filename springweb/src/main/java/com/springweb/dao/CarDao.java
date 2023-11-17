package com.springweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.springweb.model.Car;
import com.springweb.util.DbUtil;

public class CarDao{
  private Connection connection;

  public CarDao{
    connection = DbUtil.getConnection();
  }

  public void addCar(Car car){
    try{
      PreparedStatement preparedStatement = connection.prepareStatement("insert intocars(manufecturer.model)valuess (?,?)");
      preparedStatement.setString(1, car.getManufacture());
      preparedStatement.setInt(2, car.getModel());
    } catch (SQLException e){
      e.printStackTrace();
    }
}
  public void deleteCar(int CarId){
    try {
      PreparedStatement preparedStatement = connection.prepareStatement("delete from cars where Carid=?");
      preparedStatement.setInt(1, CarId);
      preparedStatement.executeUpdate();
    } catch (SQLException e){
      e.printStackTrace();
    }
   }
}
