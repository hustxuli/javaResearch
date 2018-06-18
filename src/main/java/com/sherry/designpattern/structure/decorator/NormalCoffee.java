package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:57
 */
public class NormalCoffee implements Coffee {
    @Override
    public String getName() {
        return "咖啡";
    }

    @Override
    public Double getPrice() {
        return 10.0;
    }
}
