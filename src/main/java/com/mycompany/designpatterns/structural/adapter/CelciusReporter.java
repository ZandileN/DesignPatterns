/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.structural.adapter;

/**
 *
 * @author Sibakhulu
 */
public class CelciusReporter {
    
    double tempratureInC;
    
    public CelciusReporter(){
    }
    
    public double getTemperature(){
    return tempratureInC;
    }
    public void setTemperature(double tempratureInC){
    this.tempratureInC= tempratureInC;
    }
}
