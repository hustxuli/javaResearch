package com.sherry.designpattern.behavior.state.commonpattern.biz;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午4:45
 */
public enum EventEnum {
    GREEN_LIGHT_ON(1,"绿灯亮")
    ,GET_ON_SUBWA(2,"人上车")
    ,RED_LIGHT_ON(3,"红灯亮")
    ,ARRIVE_AT_STATION(4,"车到站")
    ,ROAD_GLITCH(5,"路段故障")
    ;

    private Integer code;
    private String desc;
    EventEnum(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }

}
