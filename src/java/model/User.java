/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class User {
    private int userID;
    private String userName;
    private String userPass;
    private String userEmail;
    private String userAddress;
    private int userStatus;
    private String userIMG;
    private int roleID;
    private String phoneNumber;
    private String userCode;


    public User() {
    }

    public User(int userID, String userName, String userPass, String userEmail, String userAddress, int userStatus, String userIMG, int roleID, String phoneNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userStatus = userStatus;
        this.userIMG = userIMG;
        this.roleID = roleID;
        this.phoneNumber = phoneNumber;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserIMG() {
        return userIMG;
    }

    public void setUserIMG(String userIMG) {
        this.userIMG = userIMG;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
  
    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userStatus=" + userStatus + ", userIMG=" + userIMG + ", roleID=" + roleID + ", createDate=" + '}';
    }
    
    
}
