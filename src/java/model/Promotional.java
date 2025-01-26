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
public class Promotional {
    private int promotionalID;
    private int productID;
    private String promotionalDetails;
    private int discount;
    private Date startDate;
    private Date endDate;

    public Promotional() {
    }

    public Promotional(int promotionalID, int productID, String promotionalDetails, int discount, Date startDate, Date endDate) {
        this.promotionalID = promotionalID;
        this.productID = productID;
        this.promotionalDetails = promotionalDetails;
        this.discount = discount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getPromotionalID() {
        return promotionalID;
    }

    public void setPromotionalID(int promotionalID) {
        this.promotionalID = promotionalID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getPromotionalDetails() {
        return promotionalDetails;
    }

    public void setPromotionalDetails(String promotionalDetails) {
        this.promotionalDetails = promotionalDetails;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
