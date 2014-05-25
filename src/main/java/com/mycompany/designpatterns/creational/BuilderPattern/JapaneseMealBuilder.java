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
public class JapaneseMealBuilder implements MealBuilder {
    private Meal meal;
    
    public JapaneseMealBuilder(){
    meal= new Meal();
    }
    
     public void BuildDrink(){
      meal.setDrink("sake");
    }
    public void BuildMaincourse(){
      meal.setMainCourse("chicken");
    }
    
    public void buildSide(){
      meal.setMainCourse("miso soup");
    }
    @Override
    public Meal getMeal(){
    return meal;
    }

    @Override
    public void buildDrink() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buildMainCourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
