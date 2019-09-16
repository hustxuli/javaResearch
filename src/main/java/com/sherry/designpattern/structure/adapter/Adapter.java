package com.sherry.designpattern.structure.adapter;

import com.sherry.designpattern.structure.adapter.impl.APower;

/**
 * * 场景:用于解决两个已有的接口不兼容问题，常用于现有系统与第三方产品功能集成。将客户类的请求转化为适配者相应接口的调用,别名为wrapper包装器.
 *
 * 根据适配器类与适配者类的关系不同，分为类适配器模式和对象适配器模式.
 * (1)对象适配器是适配器中含有对适配者的对象的引用，如PowerAdapter1
 * (2)类适配器是适配器和适配者之间是继承或实现关系.
 *
 * 缺省适配器模式中，当不需要实现目标接口的所有方法时，可以设计一个抽象类而不是接口实现目标接口，对不想实现的接口提供一个空方法作为默认实现。该抽象类的子类选择性的覆盖父类中的某些方法实现需求
 *  https://www.cnblogs.com/mingmingcome/p/9810731.html
 *
 *
 * 其他：适配器可以做单向或者双向适配器，同时实现适配者和适配目标的两个接口,但使用较少
 * @Author: Sherry
 * @Date: 2019/9/1 下午6:09
 */
public class Adapter {
    public static void main(String [] args){
        /**
         * AmercianPower是旧的接口
         * ChinesePower是新的接口
         *
         */
        AmercianPower amercianPower = new APower();
        ChinesePower chinesePower;
        //PowerAdapter1是对象适配器,含有旧的接口的引用,实现新的接口,可以被新接口直接调用
        chinesePower = new PowerAdapter1(amercianPower);
        System.out.println(chinesePower.twoPlugs());

        //PowerAdapter2是类适配器,继承旧接口的实现类，实现新街口
        chinesePower = new PowerAdapter2();
        System.out.println(chinesePower.twoPlugs());


    }
}
