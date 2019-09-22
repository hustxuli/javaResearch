package com.sherry.designpattern.behavior.state.commonpattern;

import com.sherry.designpattern.behavior.state.commonpattern.biz.BizConstant;
import com.sherry.designpattern.behavior.state.commonpattern.biz.EventEnum;
import com.sherry.designpattern.behavior.state.commonpattern.biz.StateEnum;
import com.sherry.designpattern.behavior.state.commonpattern.biz.StateMachineInit;
import com.sherry.designpattern.behavior.state.commonpattern.core.BaseConstant;
import com.sherry.designpattern.behavior.state.commonpattern.core.Context;
import com.sherry.designpattern.behavior.state.commonpattern.core.StateMachine;
import lombok.extern.slf4j.Slf4j;

/**
 * https://www.jianshu.com/p/ec9614f98859
 * https://www.cnblogs.com/bastard/archive/2012/06/05/2536258.html
 * https://blog.csdn.net/houzhizhen/article/details/51724790
 * 包含一组状态集（StateEnum）、一个起始状态（start state）、一组触发事件（Event）、一个映射触发事件和当前状态到下一状态的转换机制
 *
 * @Author: Sherry
 * @Date: 2019/9/21 下午3:48
 */
@Slf4j
public class StateMachineMain {
    public static void main(String [] args){
        StateMachine stateMachine = StateMachineInit.init();
        Context context = new Context();
        context.setData(BizConstant.LOOP_COUNT,3);

        //如果路段不好，停车->开门->关门->开车->紧急制停
        context.setData(BaseConstant.CURRENT_STATE, StateEnum.STOP_SUBWAY);
        context.setData(BizConstant.ROAD_STATUS,"bad");
        stateMachine.fire(EventEnum.GREEN_LIGHT_ON,context);

        log.info("-----------------------------------------");

        //如果路段正常，停车->开门->关门->开车 持续LOOP_COUNT-1次（减去1是因为上面先跑了"停车->开门->关门->开车->紧急制停"，已经经过GreenLightOnHandler1次）
        context.setData(BaseConstant.CURRENT_STATE, StateEnum.STOP_SUBWAY);
        context.setData(BizConstant.ROAD_STATUS,"good");
        stateMachine.fire(EventEnum.GREEN_LIGHT_ON,context);




    }

}
