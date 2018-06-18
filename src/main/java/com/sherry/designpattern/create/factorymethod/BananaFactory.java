package com.sherry.designpattern.create.factorymethod;

import com.sherry.designpattern.create.staticfactory.Banana;
import com.sherry.designpattern.create.staticfactory.Fruit;

/**
 * @Author: Sherry
 * @Date: 2018/6/15 下午7:59
 */
public class BananaFactory extends FruitFactory {

    @Override
    public Fruit createFruit() {
        return new Banana("long");
    }
}
