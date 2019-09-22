package com.sherry.designpattern.behavior.state.commonpattern.core;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 上午12:21
 */
@Data
public class StateConfiguration<S, E, H> {
    private S currentState;

    //每个State有N个Event可以触发

    //每个Event触发后对应1个Handler
    private Map<E,H> eventHandleMap;
    //每个Event触发后对应1个nextState
    private Map<E,S> nextStateMap;

    public StateConfiguration(S state) {
        this.currentState = state;
        eventHandleMap = new HashMap<E, H>();
        nextStateMap = new HashMap<E, S>();
    }

    public void configEventHandle(E e,H h){
        eventHandleMap.put(e,h);
    }

    public void configEventNextState(E e,S s){
        nextStateMap.put(e,s);
    }

    public H getHandle(E e){
        return eventHandleMap.get(e);
    }

    public S getNextState(E e){
        return nextStateMap.get(e);
    }
}
