package com.sherry.designpattern.behavior.chainofresponsibility.pattern2;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:15
 */
public class LeaderLevel1 extends Handler{
    @Override
    public void handleRequest(Param param) {
        if(param.getValue() <= 20){
            System.out.println("LeaderLevel1 批准了" + param.getValue() + "天假期");
        }else{
            if(null != getSuccessor()){
                getSuccessor().handleRequest(param);
            }else{
                System.out.println("无人有权利批复");
            }
        }
    }
}
