package com.sherry.designpattern.behavior.state.pattern1;

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
    STOP_SUBWAY(1,"停车"){
        @Override
        State initState() {
            return new StateStopSubway();
        }

        @Override
        State nextState() {
            return OPEN_DOOR.initState();
        }
    }

    ,OPEN_DOOR(2,"开门"){
        @Override
        State initState() {
            return new StateOpenDoor();
        }

        @Override
        State nextState() {
            return CLOSE_DOOR.initState();
        }
    }

    ,CLOSE_DOOR(3,"关门"){
        @Override
        State initState() {
            return new StateCloseDoor();
        }

        @Override
        State nextState() {
            return START_SUBWAY.initState();
        }
    }

    ,START_SUBWAY(4,"开车"){
        @Override
        State initState() {
            return new StateStartSubway();
        }

        @Override
        State nextState() {
            return STOP_SUBWAY.initState();
        }
    }
    ;

    private Integer code;
    private String desc;
    StateEnum(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }

    abstract State initState();


    abstract State nextState();
}
