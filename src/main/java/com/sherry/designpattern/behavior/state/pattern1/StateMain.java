package com.sherry.designpattern.behavior.state.pattern1;

/**
 * 状态模式也称状态机(State Machine)
 * 适用场景：if-else中的操作代码多且复杂，更适用于 各个状态之间有切换关系的场景
 *
 *
 *
 * 优点：每个状态只需要关心自己内部的实现，而不会影响到其他的，耦合降低。 封装转换过程，也就是转换规则
 * 缺点：有多少的状态就得有多少的类，因此会创建大量的类。
 *
 * 假设地铁有以下几种状态：停车->开门->关门->开车 ……
 * @Author: Sherry
 * @Date: 2019/9/21 下午3:48
 */
public class StateMain {
    public static void main(String [] args){
        StateEnum stateEnum = StateEnum.STOP_SUBWAY;
        State state = stateEnum.initState();
        state.process();

        state = stateEnum.nextState();
        state.process();


    }
}
