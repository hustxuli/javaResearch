package com.sherry.designpattern.behavior.observer.impl;

import com.sherry.designpattern.behavior.observer.Observer;
import com.sherry.designpattern.behavior.observer.Subject;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午2:15
 */
public class MyObserver implements Observer{
    private String name;
    public MyObserver(String name){
        this.name = name;
    }
    /**
     * 在Subject改变后，更新自己
     * @param subject 将Subject接口作为参数传入，可扩展调用
     * @param args
     */
    @Override
    public void update(Subject subject, Object args) {
        System.out.println("主题发送的'"+args+"'," + this.name +  "已收到");
    }
}
