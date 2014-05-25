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
public class MealDirector {
   
   private MealBuilder mealbuilder= null;
   
   public MealDirector(){
       //MealBuilder mealbuilder
    this.mealbuilder= mealbuilder;
   }
   
   public void constructMeal(){
   
       mealbuilder.buildDrink();
       mealbuilder.buildMainCourse();
       mealbuilder.buildSide();
   }
   
   public Meal getMeal(){
    return  mealbuilder.getMeal();
   }
   
}
