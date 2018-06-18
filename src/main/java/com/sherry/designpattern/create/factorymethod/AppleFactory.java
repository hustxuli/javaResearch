package com.sherry.designpattern.create.factorymethod;

import com.sherry.designpattern.create.staticfactory.Apple;
import com.sherry.designpattern.create.staticfactory.Fruit;

/**
 * @Author: Sherry
 * @Date: 2018/6/15 下午7:58
 */
public class AppleFactory extends FruitFactory {

    @Override
    public Fruit createFruit() {
        return new Apple("red apple");
    }
}
