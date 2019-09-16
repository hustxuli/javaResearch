package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:51
 */
public interface HandleChain<T extends ParamContext> {
    void start(T paramContext);
    void addNode(T handleNode);
    void removeNode(T handleNode);
}
