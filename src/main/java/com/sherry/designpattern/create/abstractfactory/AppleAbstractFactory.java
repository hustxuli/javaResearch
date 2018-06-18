package com.sherry.designpattern.create.abstractfactory;

/**
 * @Author: Sherry
 * @Date: 2018/6/17 下午3:02
 */
public class AppleAbstractFactory extends FruitAbstractFactory {
    @Override
    public AbstractProduct createFruit() {
        return new Apple();
    }

    @Override
    public AbstractProduct createDrinks() {
        return new AppleJuice();
    }
}
