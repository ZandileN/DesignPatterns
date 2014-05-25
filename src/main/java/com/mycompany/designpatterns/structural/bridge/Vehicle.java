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
public abstract class Vehicle {
Engine engine;
int weightInKilos;
public abstract void drive();
public void setEngine (Engine engine) {
this.engine = engine;
}
public void reportOnSpeed ( int horsepower) {
int ratio = weightInKilos/horsepower ;
if ( ratio < 3) {
System.out.println( "The v e h i c l e i s going at a f a s t speed . " ) ;
}
else if ( ( ratio >= 3) && ( ratio < 8) ) {
System.out.println ( "The v e h i c l e i s going an average speed . " );
}
else {
System.out.println ( "The v e h i c l e i s going at a slow speed.");
}
}

}

