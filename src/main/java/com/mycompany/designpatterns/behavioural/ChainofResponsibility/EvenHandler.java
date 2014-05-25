/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.behavioural.ChainofResponsibility;

/**
 *
 * @author Sibakhulu
 */
public abstract class EvenHandler {
    
    EvenHandler succesor;
    
    public void setSuccessor( EvenHandler succesor) {
    this.succesor=succesor;
   }
    
public abstract void handleRequest(EvenNumHandler request ) ;
    
}
