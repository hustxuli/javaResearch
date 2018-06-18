package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:43
 */
public abstract class AbstractCondimentDecorator implements Coffee {
    private Coffee coffee;
    public AbstractCondimentDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getName(){
        return coffee.getName()+getCondiment();
    }

    @Override
    public Double getPrice(){
        return coffee.getPrice();
    }

    public abstract String getCondiment();
}
