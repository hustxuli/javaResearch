package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:38
 */
public interface ParamContext {
    //参数，由参数决定是否往下走
    boolean isContinue();
}
