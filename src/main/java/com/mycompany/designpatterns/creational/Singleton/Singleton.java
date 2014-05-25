/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.creational.Singleton;

/**
 *
 * @author Sibakhulu
 */
public class Singleton {
    
    private static Singleton instance= new Singleton();
    
    private Singleton(){};
     
    public static Singleton getInstance(){
      return instance;
    }
    
    public void showMessage(){
    System.out.println("hello world");
    
    }
//    private static Singleton singleton= null;
//    
//    private Singleton(){
//    }
//    public static Singleton getInstance(){
//    if(Singleton== null){
//        singleton= new Singleton();
//   }
//    return singleton;
//    }
//    
//    public void sayGoodbye(){
//    System.out.println("Good bye!");
//    }
    
    
}
