/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.structural.flyweight;

/**
 *
 * @author Sibakhulu
 */
public class FlyweightAdder implements Flyweight {
    String operation;
    public FlyweightAdder(){
operation ="adding";
try{
Thread.sleep(3000) ;
}
catch ( InterruptedException e ) {
}
//@Override
// public void doMath(int a, int b ){
//System.out.println(operation + " " + a + " and " + b + " : " + ( a + b ) ) ;
//}
    
    
    }

    @Override
    public void doMath(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}