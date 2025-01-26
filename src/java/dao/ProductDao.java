/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Product;

/**
 *
 * @author Admin
 */
public interface ProductDao {
    ArrayList<Product> getAllProducts();
    
    Product getProductByID(String idProduct);
    
    Product getProductByName(String nameProduct);
    
    Product getProductBySellerID(String sellerID);
    
    void updateProduct(Product product);
    
    void addProduct(Product product);
    
}
