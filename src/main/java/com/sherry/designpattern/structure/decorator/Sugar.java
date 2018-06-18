package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:55
 */
public class Sugar extends AbstractCondimentDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getCondiment() {
        return "加糖";
    }
    @Override
    public Double getPrice(){
        return super.getPrice() + 0.5;
    }
}
