package com.sherry.designpattern.behavior.event.impl;

import com.sherry.designpattern.behavior.event.Event;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午5:01
 */
public class HomeworkEvent extends Event{
    public HomeworkEvent(Object source) {
        super(source);
    }
    public Teacher getTeacher(){
        return (Teacher)super.getSource();
    }
}
