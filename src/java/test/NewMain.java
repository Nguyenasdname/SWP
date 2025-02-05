/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import dao.UserDao;
import dao.imp.UserDaoImp;
import model.User;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImp();
        
        User u = userDao.isUserExists("Admin1", "asd");
        
        System.out.print(u);
        
        User uNew = new User(3, "login", "123", "@gmail.com", "32 LeVANZ", 1, null, 2, "0903210843");
        
//        boolean add = userDao.addUser(uNew);
//        if(add){
//            System.out.print("Oke");
//        } else {
//            System.out.print("Hell Nal");
//         
//        }
    }
    
}
