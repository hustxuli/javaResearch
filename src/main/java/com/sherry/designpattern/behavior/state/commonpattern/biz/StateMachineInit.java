package com.sherry.designpattern.behavior.state.commonpattern.biz;

import com.sherry.designpattern.behavior.state.commonpattern.biz.impl.*;
import com.sherry.designpattern.behavior.state.commonpattern.core.Handler;
import com.sherry.designpattern.behavior.state.commonpattern.core.StateMachine;
import com.sherry.designpattern.behavior.state.commonpattern.core.StateMachineConfig;

/**
 * 状态State在事件Event发生后可以达到的新的状态State
 *         Event
 * State   绿灯亮     人上车   红灯亮   车到站    路段故障
 * 停车     开门      NA      NA      NA         NA
 * 开门     NA       关门     NA      NA         NA
 * 关门     NA       NA      开车     NA         NA
 * 开车     NA       NA      NA      停车       紧急制停
 * 紧急制停  NA       NA      NA      NA         NA
 *
 * @Author: Sherry
 * @Date: 2019/9/22 上午12:33
 */
public class StateMachineInit {
    public static StateMachine init() {
        StateMachineConfig<StateEnum,EventEnum,Handler> stateMachineConfig=new StateMachineConfig();

        stateMachineConfig.from(StateEnum.STOP_SUBWAY)
                .permit(EventEnum.GREEN_LIGHT_ON)
                .handle(new GreenLightOnHandler())
                .to(StateEnum.OPEN_DOOR)
                .build();

        stateMachineConfig.from(StateEnum.OPEN_DOOR)
                .permit(EventEnum.GET_ON_SUBWA)
                .handle(new GetOnSubwayHandler())
                .to(StateEnum.CLOSE_DOOR)
                .build();

        stateMachineConfig.from(StateEnum.CLOSE_DOOR)
                .permit(EventEnum.RED_LIGHT_ON)
                .handle(new RedLightOnHandler())
                .to(StateEnum.START_SUBWAY)
                .build();

        //1个状态对应2个event和handler
        stateMachineConfig.from(StateEnum.START_SUBWAY)
                .permit(EventEnum.ARRIVE_AT_STATION)
                .handle(new ArriveAtStationHandler())
                .to(StateEnum.STOP_SUBWAY)
                .build();

        stateMachineConfig.from(StateEnum.START_SUBWAY)
                .permit(EventEnum.ROAD_GLITCH)
                .handle(new RoadGlitchHandler()) //无to nextState
                .build();

        return new StateMachine(stateMachineConfig);
    }
}
