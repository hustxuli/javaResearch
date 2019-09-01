package com.sherry.designpattern.create.prototype;

/**
 * 原型模式
 * http://www.cnblogs.com/java-my-life/archive/2012/04/11/2439387.html
 * 应用场景很少，一般用BeanUtils.copyProperties用来做拷贝对象
 * 优点
 * 1. 方便拷贝
 * 2. 默认的object类的clone方法是浅拷贝.只拷贝基本类型，引用类型不拷贝
 * 缺点
 * 1. 每个类都要加一个clone方法.
 * 2. 含有嵌套结构或者不支持序列化的对象(没有实现Serializable)进行深拷贝，实现原型的深拷贝比较麻烦
 *
 * @Author: Sherry
 * @Date: 2019/9/1 下午4:11
 */
public class Prototype {
    public static void main(String [] args){
        FruitAbstractPrototype prototype = new Apple();
        FruitAbstractPrototype copy = (FruitAbstractPrototype)prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(copy.getName());
    }
}
