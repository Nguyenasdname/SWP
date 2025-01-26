/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Payment;

/**
 *
 * @author Admin
 */
public interface PaymentDao {
    void addPayment(Payment payment);
    
    void updatePayment(Payment payment);
    
    void deletePayment(int paymentID);
    
    Payment getPaymentById(int paymentID);
    
    ArrayList<Payment> getAllPayments();
}
