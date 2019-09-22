package com.sherry.designpattern.behavior.strategy;

/**
 * 会员计价策略
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:23
 */
public interface MemberStrategy {
    double calPrice(double originalPrice);
}
