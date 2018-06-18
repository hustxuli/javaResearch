package com.sherry.designpattern.structure.facade;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午3:55
 */
public class Windows implements AbstractService {
    @Override
    public void start() {
        System.out.println("Windows start");
    }

    @Override
    public void restart() {
        System.out.println("Windows restart");
    }

    @Override
    public void stop() {
        System.out.println("Windows stop");
    }
}
