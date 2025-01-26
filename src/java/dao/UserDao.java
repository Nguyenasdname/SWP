/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author Admin
 */
public interface UserDao {
    ArrayList<User> getAllUsers();
    
    User getUserByID(String ID);
    
    User getUserByName(String Name);
    
    boolean addUser(User user);
    
    void updateUser(User user);
    
    void deleteUser(User user);
    
    User validateUser(String userName, String userPass);
    
    User isUserExists(String userName, String userEmail);
}
