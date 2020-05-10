package com.sherry.designpattern.behavior.state.commonpattern.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 上午12:16
 */
public class StateMachineConfig<S, E, H> {
    //当前状态
    private S currentState;
    //触发事件
    private E event;
    //事件发生后的处理
    private H handler;
    //下一个状态，可以不设置
    private S nextState;

    //存放所有状态流转路线

    private final Map<S, StateConfiguration<S,E,H>> stateConfigurationMap = new HashMap<S, StateConfiguration<S,E,H>>();

    public StateMachineConfig from(S s){
        this.currentState=s;
        return this;
    }
    public StateMachineConfig permit(E e){
        this.event=e;
        return this;
    }

    public StateMachineConfig handle(H h){
        this.handler=h;
        return this;
    }

    public StateMachineConfig to(S s){
        this.nextState=s;
        return this;
    }

    public void build(){
        StateConfiguration stateConfiguration;
        if(stateConfigurationMap.get(currentState)==null){
            stateConfiguration=new StateConfiguration(currentState);
            stateConfigurationMap.put(currentState,stateConfiguration);
        }else{
            //1个状态有N个Event 的情况
            stateConfiguration = stateConfigurationMap.get(currentState);
        }
        stateConfiguration.configEventHandle(event,handler);
        stateConfiguration.configEventNextState(event,nextState);

        //查看调用方式，就知道这里置为null是因为：只new了一个StateMachineConfig，重复利用构建多个流转状态存放stateConfigurationMap中
        this.currentState=null;
        this.event=null;
        this.handler=null;
        this.nextState=null;
    }

    public H getHandle(S s,E e){
        return stateConfigurationMap.get(s)==null?null: (H)stateConfigurationMap.get(s).getHandle(e);
    }

    public S getNextState(S s,E e){
        return stateConfigurationMap.get(s)==null?null: stateConfigurationMap.get(s).getNextState(e);
    }
}
