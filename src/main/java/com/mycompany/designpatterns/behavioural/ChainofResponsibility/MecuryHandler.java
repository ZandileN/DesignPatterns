/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.behavioural.ChainofResponsibility;

import java.beans.EventHandler;

/**
 *
 * @author Sibakhulu
 */
public class MecuryHandler extends  EvenHandler{
    // EventHandler succesor;

    
    public void handleRequest(EvenNumHandler request){
        if(request==EvenNumHandler.mercury){
        System.out.println("MercuryHandler handles" + request);
        System.out.println("Mercury is hot");
        }
        else{
        System.out.println("MercuryHandler doesnt handle" + request);
         if(succesor !=null){
        succesor.handleRequest(request);
         
         }
        }
    }
   
}
