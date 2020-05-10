package com.sherry.designpattern.behavior.observer.impl;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午2:30
 */
public class MySubject extends AbstractSubject{
    /**
     * Subject自身的操作
     */
    @Override
    public String doMyBusiness() {
        System.out.println("主题发送信息！！！");
        return "hello";
    }
}
