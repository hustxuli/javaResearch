package com.sherry.designpattern.create.prototype;

import lombok.Data;

/**
 * @Author: Sherry
 * @Date: 2019/9/1 下午4:26
 */
@Data
public abstract class FruitAbstractPrototype implements Cloneable{
    private String name;

    @Override
    protected Object clone() {
        Object o = new Object();
        try {
             o = super.clone();
            //下面实现对象的深拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
