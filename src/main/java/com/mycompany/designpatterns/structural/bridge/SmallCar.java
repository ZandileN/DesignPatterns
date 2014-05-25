/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.structural.bridge;

/**
 *
 * @author Sibakhulu
 */
public class SmallCar extends Vehicle{
public SmallCar (Engine engine){
        
this.weightInKilos= 600;
this.engine = engine;
}
@Override
public void drive(){
System.out.println ( "nnThe smal l car i s dr i v ing " ) ;
int horsepower = engine.go();
reportOnSpeed (horsepower);
    
}
}
