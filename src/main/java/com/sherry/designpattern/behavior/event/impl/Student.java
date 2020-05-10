package com.sherry.designpattern.behavior.event.impl;

import com.sherry.designpattern.behavior.event.Event;
import com.sherry.designpattern.behavior.event.Listener;

/**
 * @Author: Sherry
 * @Date: 2019/9/22 下午5:00
 */
public class Student implements Listener<HomeworkEvent>{
    private String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public void update(HomeworkEvent event, Object arg) {
        Teacher teacher = event.getTeacher();
        System.out.println(teacher.getName()+"老师发送的'"+arg+"',"+this.name+"已收到");
    }
}
