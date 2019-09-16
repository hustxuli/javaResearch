package com.sherry.designpattern.structure.adapter;

import com.sherry.designpattern.structure.adapter.impl.APower;

/**
 * 类适配器
 * @Author: Sherry
 * @Date: 2019/9/14 下午3:59
 */
public class PowerAdapter2 extends APower implements ChinesePower {
    @Override
    public String twoPlugs() {
        return super.threePlugs();
    }
}
