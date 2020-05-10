package com.sherry.designpattern.behavior.observer.impl;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午2:30
 */
@Data
public class Teacher extends AbstractSubject{
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    /**
     * Subject自身的操作
     */
    @Override
    public String doMyBusiness() {
        System.out.println(this.name + "老师布置作业！！！");
        return "英语习题";
    }
}
