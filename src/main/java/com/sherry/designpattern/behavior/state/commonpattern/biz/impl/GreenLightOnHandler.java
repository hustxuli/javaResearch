package com.sherry.designpattern.behavior.state.commonpattern.biz.impl;


import com.sherry.designpattern.behavior.state.commonpattern.biz.BizConstant;
import com.sherry.designpattern.behavior.state.commonpattern.biz.EventEnum;
import com.sherry.designpattern.behavior.state.commonpattern.core.Context;
import com.sherry.designpattern.behavior.state.commonpattern.core.Handler;
import com.sherry.designpattern.behavior.state.commonpattern.core.StateMachine;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午4:51
 */
@Slf4j
public class GreenLightOnHandler implements Handler{
    public static int cnt = 0;
    /**
     * currentStatus在触发Event后的处理
     *
     * @param context      上下文参数，用于在各个状态流转时传递参数
     * @param stateMachine currentStatus在触发Event后的处理，处理的结果决定下一个流转的方向(下一个事件是什么)，用于调用stateMachine.fire(event,context)
     */
    @Override
    public void handle(Context context, StateMachine stateMachine) {
        //停车->开门->关门->开车 持续次数，别死循环了
        if(cnt < (Integer)context.getData(BizConstant.LOOP_COUNT) ){
            cnt++;
            log.info("绿灯亮后handle");
            //主导下一次往哪走
            stateMachine.fire(EventEnum.GET_ON_SUBWA,context);
        }


    }
}
