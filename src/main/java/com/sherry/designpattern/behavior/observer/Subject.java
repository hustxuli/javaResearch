package com.sherry.designpattern.behavior.observer;

import java.util.Observable;

/**
 * Java中有现成的接口，java.util.Observable
 * @Author: Sherry
 * @Date: 2019/9/21 下午2:10
 */
public interface Subject {

    public void addObserver(Observer observer);

    public void delObserver(Observer observer);

    /**
     * 更新参数
     * @param arg
     */
    public void notifyEveryObserver(Object arg);

    /**
     * Subject自身的操作
     */
    public String doMyBusiness();

    public void process();
}
