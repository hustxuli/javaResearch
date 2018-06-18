package com.sherry.designpattern.create.factorymethod;

import com.sherry.designpattern.create.staticfactory.Fruit;

/**
 * @Author: Sherry
 * @Date: 2018/6/15 下午7:59
 *
 * 核心：把静态工厂模式中的FruitFactory的方法抽象出来
 */
public abstract class FruitFactory {
    public abstract Fruit createFruit();
}
