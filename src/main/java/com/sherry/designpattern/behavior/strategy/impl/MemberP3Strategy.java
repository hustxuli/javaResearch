package com.sherry.designpattern.behavior.strategy.impl;

import com.sherry.designpattern.behavior.strategy.MemberStrategy;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:30
 */
public class MemberP3Strategy implements MemberStrategy {
    private double discnt = 0.95;
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * discnt;
    }
}
