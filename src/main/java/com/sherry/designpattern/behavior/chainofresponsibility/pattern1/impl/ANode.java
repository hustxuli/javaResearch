package com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl;

import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Node;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Request;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Response;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午4:59
 */
public class ANode implements Node{
    @Override
    public void handle(Request request, Response response, NodeChain chain) {
        //过滤a
        String value = request.getValue();
        String filterValue = value.replaceAll("a","");
        request.setValue(filterValue);
        response.setResponseMsg(response.getResponseMsg() + "|---ANode处理---|");
        System.out.println("ANode处理后：" + request.getValue());
        chain.handle(request,response,chain);

    }
}
