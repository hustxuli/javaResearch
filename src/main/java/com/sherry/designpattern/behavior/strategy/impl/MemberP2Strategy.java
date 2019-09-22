package com.sherry.designpattern.behavior.strategy.impl;

import com.sherry.designpattern.behavior.strategy.MemberStrategy;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:29
 */
public class MemberP2Strategy implements MemberStrategy {
    private double discnt = 0.9;
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * discnt;
    }
}
