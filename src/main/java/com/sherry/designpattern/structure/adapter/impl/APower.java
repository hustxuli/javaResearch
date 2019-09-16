package com.sherry.designpattern.structure.adapter.impl;

import com.sherry.designpattern.structure.adapter.AmercianPower;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午3:50
 */
public class APower implements AmercianPower{
    @Override
    public String threePlugs() {
        return "美国三角插头";
    }
}
