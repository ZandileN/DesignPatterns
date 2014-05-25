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
public class CheeseBurgerMeal extends Meal{
@Override
public void prepareIngredients ( ) {
System.out.println ( "Get t ing ground be e f and Cheese " );
}
@Override
public void cook (){
System.out.println  ( "Cooking ground be e f in pan" ) ;
}
@Override
public void eat ( ) {
    System.out.println ( "The Cheese Burger s ar e t a s ty " ) ;
}
@Override
public void cleanUp(){
System.out.println( "Doing the di she s " ) ;
}
        }
    

