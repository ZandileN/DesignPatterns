/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.behavioural.template;

/**
 *
 * @author Sibakhulu
 */
public abstract class Meal {
public final void doMeal(){
prepareIngredients();
cook();
eat();
cleanUp();
}
public abstract void prepareIngredients( ) ;
public abstract void cook();
public void eat( ) {
System.out.println ( "Mmm, that ' s good" );
}
public abstract void cleanUp ();
}
