package com.sherry.designpattern.create.builder;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2018/6/15 下午8:29
 */
@Data
public class PersonBuilder {
    private String name;
    private Integer age;
    private String phone;
    private String address;
    private String car;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }
    public PersonBuilder setAge(Integer age){
        this.age = age;
        return this;
    }
    public PersonBuilder setPhone(String phone){
        this.phone = phone;
        return this;
    }
    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }
    public PersonBuilder setCar(String car){
        this.car = car;
        return this;
    }

    public Person build(){
        return new Person(this);
    }
}
