package com.sherry.designpattern.create.abstractfactory;

/**
 * @Author: Sherry
 * @Date: 2018/6/17 下午3:02
 */
public class BananaAbstractFactory extends FruitAbstractFactory {
    @Override
    public AbstractProduct createFruit() {
        return null;
    }

    @Override
    public AbstractProduct createDrinks() {
        return null;
    }

}
