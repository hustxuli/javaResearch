package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:51
 */
public interface HandleChain<T extends ParamContext> {
    void start(T paramContext);
    //void addNode(HandleNode<T> handleNode);
    //void removeNode(HandleNode<T>  handleNode);

    //实际只关心HandlerNode中的handler，故单独提出来


    /**
     * 加在尾部
     * @param handler
     */
    void addHandler(Handler<T> handler);

    void removeHandler(Handler<T> handler);

}
