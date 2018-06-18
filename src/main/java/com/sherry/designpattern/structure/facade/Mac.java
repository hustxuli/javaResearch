package com.sherry.designpattern.structure.facade;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午3:52
 */
public class Mac implements AbstractService {
    @Override
    public void start() {
        System.out.println("Mac start");
    }

    @Override
    public void restart() {
        System.out.println("Mac restart");
    }

    @Override
    public void stop() {
        System.out.println("Mac stop");
    }
}
