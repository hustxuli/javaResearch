package com.sherry.designpattern.create.staticfactory;

import lombok.Data;

@Data
public class Apple extends Fruit {

    private String name;

    public Apple(String name){
        this.name = name;
    }

    @Override
    public String doSomething() {
        return this.name;
    }
}
