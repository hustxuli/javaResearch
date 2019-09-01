package com.sherry.designpattern.structure.bridge.impl;

import com.sherry.designpattern.structure.bridge.Pen;

/**
 * @Author: Sherry
 * @Date: 2019/9/1 下午5:46
 */
public class BigPen implements Pen{

    @Override
    public String penType() {
        return "大毛笔";
    }
}
