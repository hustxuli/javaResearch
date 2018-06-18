package com.sherry.designpattern.create.staticfactory;

import lombok.Data;

@Data
public class Banana extends Fruit{

    private String shape;

    public Banana(String shape){
        this.shape = shape;
    }

    @Override
    public String getFruitInfo() {
        return "Shape: " + this.shape;
    }

    @Override
    public String getFruitDrinks() {
        return "Drinks: banana milk" ;
    }
}
