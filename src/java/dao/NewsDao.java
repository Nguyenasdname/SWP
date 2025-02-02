/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.News;

/**
 *
 * @author Admin
 */
public interface NewsDao {
    void addNews(News news);
    
    void updateNews(News news);
    
    void deleteNews(int newsID);
    
    News getNewsById(int newsID);
    
    ArrayList<News> getAllNews();
}
