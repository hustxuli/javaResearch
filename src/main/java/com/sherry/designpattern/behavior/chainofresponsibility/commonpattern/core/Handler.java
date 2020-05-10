package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.core;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.core.ParamContext;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:34
 */
public interface Handler<T extends ParamContext> {
   void process(T param);
}
