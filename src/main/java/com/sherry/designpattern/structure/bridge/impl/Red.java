package com.sherry.designpattern.structure.bridge.impl;

import com.sherry.designpattern.structure.bridge.Color;

/**
 * @Author: Sherry
 * @Date: 2019/9/1 下午5:45
 */
public class Red implements Color {
    @Override
    public String draw() {
        return "红色";
    }
}
