/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Order;

/**
 *
 * @author Admin
 */
public interface OrderDao {
    void addOrder(Order order);
    
    void updateOrder(Order order);
    
    void deleteOrder(int orderID);
    
    Order getOrderById(int orderID);
    
    ArrayList<Order> getAllOrders();
}
