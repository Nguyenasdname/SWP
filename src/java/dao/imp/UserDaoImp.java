/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.imp;

import java.sql.Connection;
import dao.ConnectionDatabase;
import dao.UserDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDaoImp implements UserDao {

    @Override
    public ArrayList<User> getAllUsers() {
        ArrayList<User> userList = new ArrayList();
        return userList;
    }

    @Override
    public User getUserByID(String ID) {
        User user = new User();
        return user;
    }

    @Override
    public User getUserByName(String Name) {
        User user = new User();
        return user;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "Insert into Users(UserName, UserPass, UserAddress, UserEmail, UserStatus, RoleID, PhoneNumber)\n"
                + "values (?,?,?,?,?,?,?)";
        try (
                Connection con = ConnectionDatabase.getConnection(); PreparedStatement preStatement = con.prepareStatement(sql);) {

            preStatement.setString(1, user.getUserName());
            preStatement.setString(2, user.getUserPass());
            preStatement.setString(3, user.getUserEmail());
            preStatement.setString(4, user.getUserAddress());
            preStatement.setInt(5, user.getUserStatus());
            preStatement.setString(6, user.getUserIMG());
            preStatement.setInt(7, user.getRoleID());
            preStatement.setString(8, user.getPhoneNumber());

            int rowsAffected = preStatement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        String sql = "UPDATE Users SET "
                + "UserName = ?, "
                + "UserPass = ?, "
                + "UserEmail = ?, "
                + "UserAddress = ?, "
                + "UserStatus = ?, "
                + "UserIMG = ?, "
                + "RoleID = ?, "
                + "PhoneNumber = ? "
                + "WHERE UserEmail = ?"; 

        try (Connection con = ConnectionDatabase.getConnection(); PreparedStatement preStatement = con.prepareStatement(sql)) {

            preStatement.setString(1, user.getUserName());
            preStatement.setString(2, user.getUserPass());
            preStatement.setString(3, user.getUserEmail());
            preStatement.setString(4, user.getUserAddress());
            preStatement.setInt(5, user.getUserStatus());
            preStatement.setString(6, user.getUserIMG());
            preStatement.setInt(7, user.getRoleID());
            preStatement.setString(8, user.getPhoneNumber());
            preStatement.setString(9, user.getUserEmail());

            int rowsAffected = preStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public User validateUser(String userName, String userPass) {
        User u = null;
        String sql = "Select *from Users Where UserName = ? and UserPass = ?";
        try (
                Connection con = ConnectionDatabase.getConnection(); PreparedStatement preStatement = con.prepareStatement(sql);) {

            preStatement.setString(1, userName);
            preStatement.setString(2, userPass);

            try (ResultSet resultSet = preStatement.executeQuery()) {
                if (resultSet.next()) {
                    u = new User(resultSet.getInt("UserID"),
                            resultSet.getString("UserName"),
                            resultSet.getString("UserPass"),
                            resultSet.getString("UserEmail"),
                            resultSet.getString("UserAddress"),
                            resultSet.getInt("UserStatus"),
                            resultSet.getString("UserImg"),
                            resultSet.getInt("RoleID"),
                            resultSet.getString("PhoneNumber")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public User isUserExists(String userName, String userEmail) {
        User u = null;
        String sql = "Select *from Users Where UserName = ? or UserEmail = ?";
        try (
                Connection con = ConnectionDatabase.getConnection(); PreparedStatement preStatement = con.prepareStatement(sql);) {

            preStatement.setString(1, userName);
            preStatement.setString(2, userEmail);

            try (ResultSet resultSet = preStatement.executeQuery()) {
                if (resultSet.next()) {
                    u = new User(resultSet.getInt("UserID"),
                            resultSet.getString("UserName"),
                            resultSet.getString("UserPass"),
                            resultSet.getString("UserEmail"),
                            resultSet.getString("UserAddress"),
                            resultSet.getInt("UserStatus"),
                            resultSet.getString("UserImg"),
                            resultSet.getInt("RoleID"),
                            resultSet.getString("PhoneNumber")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
