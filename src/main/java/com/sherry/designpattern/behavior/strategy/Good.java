package com.sherry.designpattern.behavior.strategy;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:23
 */
public class Good {
    //接口作为私有成员
    private MemberStrategy strategy;
    public Good(MemberStrategy strategy){
        this.strategy = strategy;
    }

    public double getPrice(double original){
        return this.strategy.calPrice(original);
    }
}
