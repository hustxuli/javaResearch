package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:34
 */
public interface Handler<T extends ParamContext> {
   void process(T param);
}
