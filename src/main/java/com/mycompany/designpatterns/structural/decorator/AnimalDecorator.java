/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.structural.decorator;

/**
 *
 * @author Sibakhulu
 */
public class AnimalDecorator implements Animal{
    Animal  animal ;
public AnimalDecorator (Animal animal) {
this.animal = animal ;
}

public void describe(){
System.out.println("I am an animaldecorator.");
}
}