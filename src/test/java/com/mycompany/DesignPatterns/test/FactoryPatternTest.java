/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.creational.factoryPattern.Shape;
import com.mycompany.designpatterns.creational.factoryPattern.ShapeFactory;
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
public class FactoryPatternTest {
    
    public FactoryPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void factoryPatternTest() { 
      ShapeFactory shapeFactory = new ShapeFactory();
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      shape1.draw();
      
      Shape shape2 = shapeFactory.getShape("RECTANGLE");
      shape2.draw();
      Shape shape3 = shapeFactory.getShape("SQUARE");
      shape3.draw();
     
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
