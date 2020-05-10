package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.biz;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.core.Handler;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午7:04
 */
public class AHandler implements Handler<DefaultParamContext> {
    @Override
    public void process(DefaultParamContext param) {
        if(param.isContinue() == true){
            System.out.println("AHandler处理");
        }
    }
}
