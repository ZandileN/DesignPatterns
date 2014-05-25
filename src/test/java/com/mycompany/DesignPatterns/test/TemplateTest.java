/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.behavioural.template.CheeseBurgerMeal;
import com.mycompany.designpatterns.behavioural.template.HamburgerMeal;
import com.mycompany.designpatterns.behavioural.template.Meal;
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
public class TemplateTest {
    
    public TemplateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void templateTest(){
   Meal meal1 = new HamburgerMeal();
meal1.doMeal();
System.out.println();
Meal meal2= new CheeseBurgerMeal();
meal2.doMeal( ) ;
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
