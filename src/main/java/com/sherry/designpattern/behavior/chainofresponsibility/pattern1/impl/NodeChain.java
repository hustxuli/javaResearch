package com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl;

import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Node;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Request;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Response;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午5:07
 */
@Data
public class NodeChain implements Node {
    private List<Node> chainList = new ArrayList<>();
    //初始化为0
    private int index = 0;

    public NodeChain addNode(Node node){
        chainList.add(node);
        return this;
    }

    @Override
    public void handle(Request request, Response response, NodeChain chain) {
        //上面 or 下面 都可以
        /*List<Node> chainList = chain.getChainList();
        int i = chain.getIndex();
        if(i == chainList.size()){
            response.setResponseMsg(response.getResponseMsg() + "|---chain结束---|");
        }else{
            Node node = chainList.get(i);
            i++;
            chain.setIndex(i);
            node.handle(request,response,chain);
        }*/


        //最外层main调用时，NodeChain实例.handler(request,response,chain) 与 传入的参数chain 是同一个
        //自始至终都只有1个NodeChain实例
        //如果handler()中无参数chain，ANode处理后，回不来到chain中，无法往下走
        if (index == chainList.size()) {
            response.setResponseMsg(response.getResponseMsg() + "|---chain结束---|");
        }else{
            Node node = chainList.get(index);//在真正的处理节点filter中，再调 传入的filterChain.doFilter处理
            index++;//只要调用
            node.handle(request,response,chain);
        }
    }
}
