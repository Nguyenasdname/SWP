/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Shipment {
    private int shipmentID;
    private int shipperID;
    private int orderID;
    private String shipmentAddress;
    private double shipmentPrice;
    private String shipmentStatus;

    public Shipment() {
    }

    public Shipment(int shipmentID, int shipperID, int orderID, String shipmentAddress, double shipmentPrice, String shipmentStatus) {
        this.shipmentID = shipmentID;
        this.shipperID = shipperID;
        this.orderID = orderID;
        this.shipmentAddress = shipmentAddress;
        this.shipmentPrice = shipmentPrice;
        this.shipmentStatus = shipmentStatus;
    }

    public int getShipmentID() {
        return shipmentID;
    }

    public void setShipmentID(int shipmentID) {
        this.shipmentID = shipmentID;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public double getShipmentPrice() {
        return shipmentPrice;
    }

    public void setShipmentPrice(double shipmentPrice) {
        this.shipmentPrice = shipmentPrice;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }
    
    
}
