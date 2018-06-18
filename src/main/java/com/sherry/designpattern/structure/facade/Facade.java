package com.sherry.designpattern.structure.facade;

/**
 *
 * @Author: Sherry
 * @Date: 2018/6/18 下午3:55
 *
 * 外观模式
 * 场景:
 * 1.封装聚合关系的同一个操作，多个部件组成一个系统，为了实现同一个功能做封装
 * 2.聚合的各个子部件最好实现统一的接口
 * 3.客户端和子系统间解耦，只需要和facade类交互即可
 * 4.比如保单对于一家的险企的报价，核保，支付，出单四个步骤，可以定义统一的接口，类似AbstractService
 *
 * 缺点是：需要最开始就规划好AbstractService这个接口，如果最开始没有规划这样的接口，而又想拓展OperationSystemFacade（譬如新增Linux）就用装饰器模式
 */
public class Facade {
    public static void main(String [] args){
        OperationSystemFacade facade = new OperationSystemFacade();
        facade.start();
        facade.restart();
        facade.stop();
    }
}
