package com.sherry.designpattern.behavior.templatemethod;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午4:03
 */
public class BusTicket extends AbstractTicket{
    @Override
    public void selectTicket() {
        System.out.println("公交车票。。。。。。");
    }
}
