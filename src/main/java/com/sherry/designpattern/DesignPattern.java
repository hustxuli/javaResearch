package com.sherry.designpattern;

/**
 *
 * structure类的，不会对已有接口进行修改，只是起一个封装作用，新的包装类Wrapper，新接口都在wrapper中拓展，不修改原有类
 * @Author: Sherry
 * @Date: 2019/9/1 下午2:59
 */
public class DesignPattern {
    /*
    * 封装和归一化是战略，强调领域模型的设计简单
    * 设计模式是战术
    *
    * 两个类的关系：
    * is a 继承，白盒调用(能用接口的地方尽量不要用继承)，比如工厂模式封装(子类多)
    * has a 聚合，成员变量，比如建造者模式(参数多)，譬如computer 包含disk，mem，CPU等
    * like a 组合，实现接口，比如适配器模式，行为的封装，协议
    * 外观模式，封装聚合关系的同一个操作，多个部件组成一个系统，为了实现同一个功能做封装
    *
    * 设计模式主要分为三大类：
    * 1、创建型create
    * 2、结构性structure
    * 3、行为型behavior
    *
    * */
}
