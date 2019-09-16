package com.sherry.designpattern.structure.adapter;

import com.sherry.designpattern.structure.adapter.AmercianPower;
import com.sherry.designpattern.structure.adapter.ChinesePower;

/**
 * 对象适配器
 * @Author: Sherry
 * @Date: 2019/9/14 下午3:51
 */
public class PowerAdapter1 implements ChinesePower{
    //含有对适配者AmercianPower的对象的引用
    private AmercianPower amercianPower;

    public PowerAdapter1(AmercianPower amercianPower){
        this.amercianPower = amercianPower;
    }

    @Override
    public String twoPlugs() {
        return amercianPower.threePlugs();
    }
}
