/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.creational.BuilderPattern.ItalianMealBuilder;
import com.mycompany.designpatterns.creational.BuilderPattern.MealBuilder;
import com.mycompany.designpatterns.creational.BuilderPattern.MealDirector;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class BuilderPatternTest {
    
    public BuilderPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestBuilder(){
     
         MealBuilder mealbuilder= new ItalianMealBuilder();
         //MealBuilder mealdirector = new MealDirector();
//      public void constructMeal(){
//       
//          mealbuilder.buildDrink("");
//          mealbuilder.buildMaincourse("");
//          mealbuilder.buildSide("");
//      
//      }
}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
