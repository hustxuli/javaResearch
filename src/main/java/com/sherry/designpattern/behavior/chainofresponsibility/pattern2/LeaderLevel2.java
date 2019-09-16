package com.sherry.designpattern.behavior.chainofresponsibility.pattern2;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午6:14
 */
public class LeaderLevel2 extends Handler{
    @Override
    public void handleRequest(Param param) {
        if(param.getValue() <= 10){
            System.out.println("LeaderLevel2 批准了" + param.getValue() + "天假期");
        }else{
            if(null != getSuccessor()){
                getSuccessor().handleRequest(param);
            }else{
                System.out.println("无人有权利批复");
            }
        }
    }
}
