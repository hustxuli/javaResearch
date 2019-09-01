package com.sherry.designpattern.create.builder;

/**
 * Build模式
 * @Author: Sherry
 * @Date: 2018/6/15 下午8:30
 */
public class Build {
    public static void main(String [] args){
        Person person = new PersonBuilder().setName("sherry").setAddress("river").build();
    }
}
