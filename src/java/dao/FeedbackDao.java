/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.ArrayList;
import model.Feedback;
/**
 *
 * @author Admin
 */
public interface FeedbackDao {
    void addFeedback(Feedback feedback);
    
    void updateFeedback(Feedback feedback);
    
    void deleteFeedback(int feedbackID);
    
    Feedback getFeedbackById(int feedbackID);
    
    ArrayList<Feedback> getAllFeedbacks();
}
