package com.sherry.designpattern.structure.facade;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午3:56
 */
public class OperationSystemFacade implements AbstractService{
    private Mac mac;
    private Windows windows;

    public OperationSystemFacade(){
        mac = new Mac();
        windows = new Windows();
    }

    @Override
    public void start() {
        mac.start();
        windows.start();
    }

    @Override
    public void restart() {
        mac.restart();
        windows.restart();
    }

    @Override
    public void stop() {
        mac.stop();
        windows.stop();
    }
}
