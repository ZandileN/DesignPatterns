/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.creational.BuilderPattern;

/**
 *
 * @author Sibakhulu
 */
public class Meal {
    private String drink;
    private String maincourse;
    private String side;
    
    public String getDrink(){
    return drink;
    }
    public void setDrink(String dr){
        this.drink= drink;
    }
    
    public String getMaincourse(){
    return maincourse;
    }
    public void setMainCourse(String mc){
        this.maincourse= mc;
    }
   
    public String getSide(){
    return side;
    }
    public void setSide(String side){
        this.side= side;
    }
    
    public String toString(){
    
    return " Drink " + drink + " " + " Maincourse " + maincourse+ " side " + side;
    }
}
