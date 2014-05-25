/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.structural.facade;

import com.mycompany.designpatterns.creational.factoryPattern.Square;

/**
 *
 * @author Sibakhulu
 */
public class ShapeMaker  {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker(){
      circle = (Shape) new Circle();
     rectangle = new Rectangle(); 
     square = (Shape) new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw(); 
    } 
    public void drawSquare(){
        square.draw();
}
}