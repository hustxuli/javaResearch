package com.sherry.designpattern.behavior.strategy.impl;

import com.sherry.designpattern.behavior.strategy.MemberStrategy;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:27
 */
public class MemberP1Strategy implements MemberStrategy{
    private double discnt = 0.85;
    @Override
    public double calPrice(double originalPrice) {
        return originalPrice * discnt;
    }
}
