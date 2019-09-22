package com.sherry.designpattern.behavior.strategy;

import com.sherry.designpattern.behavior.strategy.impl.MemberP1Strategy;

/**
 * 策略模式
 * https://www.jianshu.com/p/3bcf55cf83d3
 * 针对一组算法，将每一个算法封装到具有共同接口的独立的具体算法类中.
 * 多个具体类实现一个共同接口,相同行为的不同实现,lambda表达式的本质
 *
 * 主要包含三种角色：
 * 上下文角色（Context）：用来操作策略的上下文环境，屏蔽高层模块（客户端）对策略，算法的直接访问，封装可能存在的变化；
 * 抽象策略角色（Strategy）：规定策略或算法的行为；
 * 具体策略角色（ConcreteStrategy）：具体的策略或算法实现；
 *
 * 本例中：Context = Good
 *
 *
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:05
 */
public class Strategy {
    public static void main(String [] args){
        MemberStrategy strategy = new MemberP1Strategy();
        Good good = new Good(strategy);
        System.out.println(good.getPrice(100));
    }
}
