package com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl;

import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Node;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Request;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Response;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午5:14
 */
public class BNode implements Node{
    @Override
    public void handle(Request request, Response response, NodeChain chain) {
        //过滤b
        String value = request.getValue();
        String filterValue = value.replaceAll("b","");
        request.setValue(filterValue);
        response.setResponseMsg(response.getResponseMsg() + "|---BNode处理---|");
        System.out.println("BNode处理后：" + request.getValue());
        chain.handle(request,response,chain);
    }
}
