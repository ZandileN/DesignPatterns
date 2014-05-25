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

public class GrowlDecorator extends AnimalDecorator{
    
    public GrowlDecorator (Animal animal){
super (animal);
    }
@Override
public void describe( ) {
animal.describe();
growl();
}
public void growl(){
System.out.println( "Gr r r r r . " );
}

}