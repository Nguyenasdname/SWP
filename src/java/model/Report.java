/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Report {
    private int reportID;
    private int reporterID;
    private int reportedID;
    private String reportDetails;

    public Report() {
    }

    public Report(int reportID, int reporterID, int reportedID, String reportDetails) {
        this.reportID = reportID;
        this.reporterID = reporterID;
        this.reportedID = reportedID;
        this.reportDetails = reportDetails;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getReporterID() {
        return reporterID;
    }

    public void setReporterID(int reporterID) {
        this.reporterID = reporterID;
    }

    public int getReportedID() {
        return reportedID;
    }

    public void setReportedID(int reportedID) {
        this.reportedID = reportedID;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }
    
    
}
