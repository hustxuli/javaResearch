package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.impl;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.Handler;

/**
 * @Author: Sherry
 * @Date: 2019/9/16 下午10:41
 */
public class BHandler implements Handler<DefaultParamContext> {
    @Override
    public void process(DefaultParamContext param) {
        if(param.isContinue() == false){
            System.out.println("BHandler处理");
        }
    }
}
