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
public class VenusHandler extends EvenHandler{
    
    
    public void handleRequest (EvenNumHandler request){
        if(request==EvenNumHandler.venus){
        System.out.println("VenusHandler handles" + request);
        System.out.println("Mercury is not poisinous");
        }
        else{
        System.out.println("VenusHandler doesnt handle" + request);
         if(succesor !=null){
        succesor.handleRequest(request);
         
         }
        }
    }
   
    
}
