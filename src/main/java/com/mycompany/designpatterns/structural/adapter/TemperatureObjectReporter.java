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
public class TemperatureObjectReporter implements TempratureInfo{
    
  CelciusReporter celciusreporter;
  public TemperatureObjectReporter(){
   celciusreporter= new CelciusReporter();
  }
  
public double getTemperatureInC(){
return celciusreporter.getTemperature();
}

public double getTemperatureInF(){
return cToF(celciusreporter.getTemperature());
}

public void setTemperatureInC(double temperatureInC){
 celciusreporter.setTemperature(temperatureInC);
}

public void setTemperatureInF( double temperatureInC){
celciusreporter.setTemperature(temperatureInC);
}
private double fToC(double f ){
    return ( (f-32) *5/9) ;
}

private double cToF(double c) {
return ((c * 9 / 5) + 32);

}

    @Override
    public double getTemperatureInf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTemperatureInf(double temperatureInF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTemperatureInc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTemperatureInc(double temperatureInc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}