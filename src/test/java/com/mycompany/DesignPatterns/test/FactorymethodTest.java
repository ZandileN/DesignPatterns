/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.creational.factorymethod.Animal;
import com.mycompany.designpatterns.creational.factorymethod.AnimalFactory;
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
public class FactorymethodTest {
    
    public FactorymethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void FactoryTest() {
     AnimalFactory animalfactory= new AnimalFactory();
     Animal a1= animalfactory.getAnimal("feline");
     
     System.out.println("a1 sound" + a1.makeSound());
     
     Animal a2= animalfactory.getAnimal("feline");
     
     System.out.println("a2 sound" + a2.makeSound());
     
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
