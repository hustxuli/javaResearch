package com.sherry.designpattern.behavior.state.commonpattern.biz.impl;


import com.sherry.designpattern.behavior.state.commonpattern.biz.BizConstant;
import com.sherry.designpattern.behavior.state.commonpattern.biz.EventEnum;
import com.sherry.designpattern.behavior.state.commonpattern.core.Context;
import com.sherry.designpattern.behavior.state.commonpattern.core.Handler;
import com.sherry.designpattern.behavior.state.commonpattern.core.StateMachine;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午4:54
 */
@Slf4j
public class RedLightOnHandler implements Handler {

    /**
     * currentStatus在触发Event后的处理
     *
     * @param context      上下文参数，用于在各个状态流转时传递参数
     * @param stateMachine currentStatus在触发Event后的处理，处理的结果决定下一个流转的方向(下一个事件是什么)，用于调用stateMachine.fire(event,context)
     */
    @Override
    public void handle(Context context, StateMachine stateMachine) {
        log.info("红灯亮后handle");
        if(context.getData(BizConstant.ROAD_STATUS).equals("good")){
            stateMachine.fire(EventEnum.ARRIVE_AT_STATION,context);
        }else{
            stateMachine.fire(EventEnum.ROAD_GLITCH,context);
        }

    }
}
