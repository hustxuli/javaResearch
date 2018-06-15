package com.sherry.designpattern.create.staticfactory;

public class Banana extends Fruit{

    private String shape;

    public Banana(String shape){
        this.shape = shape;
    }

    public String doSomething() {
        return this.shape;
    }
}
