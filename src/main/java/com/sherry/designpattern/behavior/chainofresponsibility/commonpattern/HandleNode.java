package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:35
 */
@Data
public class HandleNode<T extends ParamContext> {
    //后继节点
    private HandleNode<T> next;

    //该节点要处理的事情
    private Handler<T> handler;

}
