/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Role;

/**
 *
 * @author Admin
 */
public interface RoleDao {
    void addRole(Role role);
    
    void updateRole(Role role);
    
    void deleteRole(int roleID);
    
    Role getRoleById(int roleID);
    
    ArrayList<Role> getAllRoles();
}
