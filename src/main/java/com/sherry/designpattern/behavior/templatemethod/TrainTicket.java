package com.sherry.designpattern.behavior.templatemethod;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午4:03
 */
public class TrainTicket extends AbstractTicket {
    @Override
    public void selectTicket() {
        System.out.println("火车票。。。。。。。");
    }

    @Override
    public void pay() {
        System.out.println("微信支付。。。。。。。");
    }

}
