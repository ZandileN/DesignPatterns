/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.structural.decorator.Animal;
import com.mycompany.designpatterns.structural.decorator.GrowlDecorator;
import com.mycompany.designpatterns.structural.decorator.LegDecorator;
import com.mycompany.designpatterns.structural.decorator.LivingAnimal;
import com.mycompany.designpatterns.structural.decorator.WingDecorator;
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
public class DecoratorTest {
    
    public DecoratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void DecoratorTest() {
Animal animal = new LivingAnimal();
animal.describe();
animal = new LegDecorator(animal);
animal.describe();
animal = new WingDecorator (animal);
animal.describe();
animal = new GrowlDecorator(animal) ;
//animal = new GrowlDecorator (animal);
     
     
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
