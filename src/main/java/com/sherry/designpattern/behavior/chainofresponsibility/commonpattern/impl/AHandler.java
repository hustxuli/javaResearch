package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.impl;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.Handler;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.ParamContext;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午7:04
 */
public class AHandler implements Handler<DefaultParamContext> {
    @Override
    public void process(DefaultParamContext param) {
        if(param.isContinue()){
            System.out.println("AHandler处理");
        }
    }
}
