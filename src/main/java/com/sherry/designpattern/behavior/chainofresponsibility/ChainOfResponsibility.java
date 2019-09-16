package com.sherry.designpattern.behavior.chainofresponsibility;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.*;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.Handler;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.impl.AHandler;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.impl.BHandler;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.impl.CHandler;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.impl.DefaultParamContext;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl.NodeChain;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Request;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.Response;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl.ANode;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern1.impl.BNode;
import com.sherry.designpattern.behavior.chainofresponsibility.pattern2.*;

/**
 * 职责链
 * 优点：
 * 简化了对象之间的连接。每个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。
 *
 * 缺点：
 * 对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。
 * 职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用。
 *
 * pattern1 参考 https://www.cnblogs.com/ysw-go/p/5432921.html
 * pattern2 参考 http://c.biancheng.net/view/1383.html
 *
 * @Author: Sherry
 * @Date: 2019/9/14 下午4:27
 */
public class ChainOfResponsibility {
    public static void main(String [] args){
        //pattern1
        System.out.println("pattern1");
        ANode aNode = new ANode();
        BNode bNode = new BNode();
        NodeChain chain  = new NodeChain().addNode(aNode).addNode(bNode);
        Request request = new Request().setValue("aaabbbcc");
        Response response = new Response().setResponseMsg("|---chain开始---|");
        chain.handle(request,response,chain);
        System.out.println(response.getResponseMsg());

        System.out.println();

        //pattern2
        System.out.println("pattern2");
        LeaderLevel1 leader1 = new LeaderLevel1();
        LeaderLevel2 leader2 = new LeaderLevel2();
        LeaderLevel3 leader3 = new LeaderLevel3();
        leader3.setSuccessor(leader2).setSuccessor(leader1);
        Param param = new Param();
        param.setValue(3);
        leader3.handleRequest(param);

        param.setValue(7);
        leader3.handleRequest(param);

        param.setValue(15);
        leader3.handleRequest(param);

        System.out.println();

        //common pattern (抽象出来，接口作为成员变量)
        System.out.println("common pattern");
        HandleChain<DefaultParamContext> handleChain = new HandleChainImpl();
        Handler<DefaultParamContext> handler1 = new AHandler();
        Handler<DefaultParamContext> handler2 = new BHandler();
        Handler<DefaultParamContext> handler3 = new CHandler();
        DefaultParamContext paramContext = new DefaultParamContext();
        handleChain.addHandler(handler1);
        handleChain.addHandler(handler2);
        handleChain.addHandler(handler3);

        handleChain.start(paramContext);

        System.out.println("———删除节点后———");
        handleChain.removeHandler(handler3);
        handleChain.start(paramContext);



    }
}
