/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Shipment;

/**
 *
 * @author Admin
 */
public interface ShipmentDao {
    void addShipment(Shipment shipment);
    
    void updateShipment(Shipment shipment);
    
    void deleteShipment(int shipmentID);
    
    Shipment getShipmentById(int shipmentID);
    
    ArrayList<Shipment> getAllShipments();
}
