package com.sherry.designpattern.behavior.state.commonpattern.biz;

import com.sherry.designpattern.behavior.state.pattern1.State;
import com.sherry.designpattern.behavior.state.pattern1.impl.StateCloseDoor;
import com.sherry.designpattern.behavior.state.pattern1.impl.StateOpenDoor;
import com.sherry.designpattern.behavior.state.pattern1.impl.StateStartSubway;
import com.sherry.designpattern.behavior.state.pattern1.impl.StateStopSubway;

/**
 * java的枚举也可以包含方法，我们可以在枚举类中写一个抽象方法（abstract），这样枚举类中的每个成员都会继承该方法，
 *  这个就是java版状态机的核心所在
 * @Author: Sherry
 * @Date: 2019/9/21 下午3:52
 */
public enum StateEnum {
    STOP_SUBWAY(1,"停车")

    ,OPEN_DOOR(2,"开门")

    ,CLOSE_DOOR(3,"关门")

    ,START_SUBWAY(4,"开车")

    ,EMERGENCY_STOP(5,"紧急制停")
    ;

    private Integer code;
    private String desc;
    StateEnum(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
