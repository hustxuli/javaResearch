package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:46
 */
public class Milk extends AbstractCondimentDecorator {
    //初始化，先初始化父类AbstractCondimentDecorator，其构造方法中的Coffee从哪儿来呢？需要子类super(coffee)
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
