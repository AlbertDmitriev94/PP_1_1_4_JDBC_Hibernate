package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {

//    private final Util util = new Util();
//
//    public UserDaoJDBCImpl() {
//    }
//
//    public void createUsersTable() {
//        try (Connection connection = Util.getConnection()) {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("CREATE TABLE `usertable`.`users` (\n" +
//                    "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
//                    "  `name` VARCHAR(45) NOT NULL,\n" +
//                    "  `lastname` VARCHAR(45) NOT NULL,\n" +
//                    "  `age` INT(3) NULL,\n" +
//                    "  PRIMARY KEY (`id`))\n" +
//                    "ENGINE = InnoDB;");
//            System.out.println("Table create success");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void dropUsersTable() {
//        try (Connection connection = Util.getConnection()) {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("DROP TABLE IF EXISTS users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        try (Connection connection = Util.getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)");
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("A user named - " + name + " has been added to the database");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void removeUserById(long id) {
//        try (Connection connection = Util.getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//        try (Connection connection = Util.getConnection()) {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//            while (resultSet.next()) {
//                User user = new User();
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }
//
//    public void cleanUsersTable() {
//        try (Connection connection = Util.getConnection()) {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("DELETE FROM users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

