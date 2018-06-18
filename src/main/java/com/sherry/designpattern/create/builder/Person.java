package com.sherry.designpattern.create.builder;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2018/6/15 下午8:26
 */
@Data
public class Person {
    private String name;
    private Integer age;
    private String phone;
    private String address;
    private String car;

    public Person(PersonBuilder personBuilder){
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.phone = personBuilder.getPhone();
        this.address = personBuilder.getAddress();
        this.car = personBuilder.getCar();
    }
}
