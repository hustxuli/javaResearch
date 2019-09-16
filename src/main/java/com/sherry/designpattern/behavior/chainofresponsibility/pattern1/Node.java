package com.sherry.designpattern.behavior.chainofresponsibility.pattern1;

import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl.NodeChain;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午4:58
 */
public interface Node {
    //如果response放在参数中，可以记录从头到尾的过程
     void handle(Request request, Response response, NodeChain chain);
}
