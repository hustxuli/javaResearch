package com.sherry.designpattern.behavior.state.pattern1.impl;

import com.sherry.designpattern.behavior.state.pattern1.State;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午4:06
 */
public class StateStartSubway implements State {
    @Override
    public void process() {
        System.out.println("State:地铁启动");
    }
}
