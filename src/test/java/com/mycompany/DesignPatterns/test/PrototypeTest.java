/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.creational.PrototypePattern.Person;
import com.mycompany.designpatterns.creational.factorymethod.Dog;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void PrototypeTest() {
         Person person= new Person("Zandile");
         System.out.println("Person 1" + person);
         Person person2= (Person) person.doClone();
         System.out.println("Person 2" + person2);
         
         Dog dog= new Dog();
         System.out.println("Dogh 1" + dog);
        // Dog dog2= (Dog) dog.doClone();
         System.out.println("dog 2:" + dog);
         
     
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
