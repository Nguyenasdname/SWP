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
public class Product {
    private int productID;
    private int sellerID;
    private int productTypeID;
    private String productName;
    private double productPrice;
    private String productTitle;
    private String productDescription;
    private int productQuantity;
    private String productStatus;
    private String farmingMethod;
    private Date harvestDate;
    private Date expiryDate;
    private String productIMG;

    public Product() {
    }

    public Product(int productID, int sellerID, int productTypeID, String productName, double productPrice, String productTitle, String productDescription, int productQuantity, String productStatus, String farmingMethod, Date harvestDate, Date expiryDate, String productIMG) {
        this.productID = productID;
        this.sellerID = sellerID;
        this.productTypeID = productTypeID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productStatus = productStatus;
        this.farmingMethod = farmingMethod;
        this.harvestDate = harvestDate;
        this.expiryDate = expiryDate;
        this.productIMG = productIMG;
    }
    
    

}
