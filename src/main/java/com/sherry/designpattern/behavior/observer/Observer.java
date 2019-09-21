package com.sherry.designpattern.behavior.observer;

/**
 *
 * @Author: Sherry
 * @Date: 2019/9/16 下午11:31
 */
public interface Observer {


    /**
     * 在Subject改变后，更新自己
     * @param subject 将Subject接口作为参数传入，可扩展调用
     * @param args
     */
    public void update(Subject subject,Object args);
}
