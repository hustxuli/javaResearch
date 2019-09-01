package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:43
 */
public abstract class AbstractCondimentDecorator implements Coffee {
    //接口作为成员变量，接口也可以作为方法参数传入
    //Coffee既是成员变量，也是该抽象类要implements的接口
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
