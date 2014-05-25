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
public class HamburgerMeal extends Meal{
@Override
public void prepareIngredients() {
System.out.println ( "Get t ing burger s , buns , and f r ench f r i e s " ) ;
}
@Override
public void cook(){
System.out.println( "Cooking burge r s on g r i l l and f r i e s in oven" ) ;
}
@Override
public void cleanUp(){
System.out.println( "Throwing away paper p l a t e s ");
}
}