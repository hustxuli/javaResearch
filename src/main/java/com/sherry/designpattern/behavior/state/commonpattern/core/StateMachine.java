package com.sherry.designpattern.behavior.state.commonpattern.core;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 上午12:27
 */
@Slf4j
public class StateMachine<S, E, H extends Handler> {
    //状态机拓扑图
    private final StateMachineConfig<S,E,H> stateMachineConfig;


    public StateMachine( StateMachineConfig<S,E,H> config) {
        this.stateMachineConfig = config;
    }

    /**
     * 带着上下文参数context，触发event，调用相应handler进行处理
     * @param event
     * @param context
     */
    public void fire(E event, Context context) {
        S currentStatus=(S)context.getData(BaseConstant.CURRENT_STATE);
        if(null==currentStatus){
            throw new RuntimeException("未找到下一个Status，状态机无法继续");
        }
        H handle=stateMachineConfig.getHandle(currentStatus, event);
        if(handle==null){
            throw new RuntimeException(String.format("当前Status下触发Event后无对应handler处理,state=[%s],event=[%s]",currentStatus,event));
        }
        S nextState=stateMachineConfig.getNextState(currentStatus, event);
        context.setData(BaseConstant.CURRENT_STATE,nextState);
        log.info("[StateMachine] runing currentState=[{}], event=[{}], handle=[{}], nextState=[{}]",currentStatus,event,handle.getClass().getSimpleName(),nextState);
        handle.handle(context,this);
    }
}
