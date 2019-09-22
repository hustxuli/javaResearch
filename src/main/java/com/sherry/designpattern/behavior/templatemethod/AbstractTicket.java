package com.sherry.designpattern.behavior.templatemethod;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午4:00
 */
public abstract class AbstractTicket {
    public void buyTicket(){
        login();
        selectTicket();
        pay();
    }

    //子类不能实现
    public final void login(){
        System.out.println("登录。。。。。");
    }

    //子类必须实现
    public abstract void selectTicket();

    //子类可实现可不实现
    public void pay(){
        System.out.println("支付宝支付。。。。。");
    }

}
