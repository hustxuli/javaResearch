package com.sherry.designpattern.behavior.event;

import lombok.Data;

import java.util.EventObject;

/**
 * Java中有现成的接口，java.util.EventObject
 * @Author: Sherry
 * @Date: 2019/9/22 下午4:55
 */
@Data
public class Event
{
    private Object source;
    public Event(Object source){
        this.source = source;
    }

}
