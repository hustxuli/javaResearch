package com.sherry.designpattern.create.abstractfactory;

/**
 * @Author: Sherry
 * @Date: 2018/6/17 下午3:03
 *
 */
public abstract class FruitAbstractFactory {
    public abstract AbstractProduct createFruit();
    public abstract AbstractProduct createDrinks();
}
