/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.creational.AbstractFactory;

import com.mycompany.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author Sibakhulu
 */
public abstract class SpeciesFactory {
    
    public abstract Animal getAnimal(String type);
    
}
