/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectionProperty {
    public static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=TestProject2;characterEncoding=UTF-8";
    public static final String user = "sa";
    public static final String pass = "123456789";
    
    
}
