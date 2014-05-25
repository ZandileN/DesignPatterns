/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.DesignPatterns.test;

import com.mycompany.designpatterns.structural.compositePattern.Employee;
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
public class CompositePatternTest {
    
    public CompositePatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void CompositeTest(){
     
     Employee CEO = new Employee("John","CEO", 30000);
     
     Employee headSales = new Employee("Robert","Head Sales", 20000);
     Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
     Employee clerk1 = new Employee("Laura","Marketing", 10000);
     
     Employee clerk2 = new Employee("Bob","Marketing", 10000); 
     Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
     Employee salesExecutive2 = new Employee("Rob","Sales", 10000); 
     CEO.add(headSales);
     CEO.add(headMarketing);
     
     headSales.add(salesExecutive1); 
     headSales.add(salesExecutive2);
     headMarketing.add(clerk1);
     headMarketing.add(clerk2);
     
//     System.out.println(CEO);
//     for (Employee headEmployee : CEO.getSubordinates()) {
//         System.out.println(headEmployee);
//     } 
//     for (Employee employee : headEmployee.getSubordinates()) {
//         System.out.println(employee);
//     }
     
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
