package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:46
 */
public class Milk extends AbstractCondimentDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCondiment() {
        return "加牛奶";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 1.5;
    }
}
