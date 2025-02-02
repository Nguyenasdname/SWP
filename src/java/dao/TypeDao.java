/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.ProductType;

/**
 *
 * @author Admin
 */
public interface TypeDao {
    void addProductType(ProductType productType);
    
    void updateProductType(ProductType productType);
    
    void deleteProductType(int productTypeID);
    
    ProductType getProductTypeById(int productTypeID);
    
    ArrayList<ProductType> getAllProductTypes();
}
