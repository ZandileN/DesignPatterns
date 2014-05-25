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
public class ItalianMealBuilder implements MealBuilder {
    private Meal meal;
    
    public ItalianMealBuilder (){
    meal= new Meal();
    }
    
    public void BuildDrink(){
      meal.setDrink("Red Wine");
    }
    public void BuildMaincourse(){
      meal.setMainCourse("pizza");
    }
    public void BuildSide(){
      meal.setSide("bread");
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

    @Override
    public void buildSide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
