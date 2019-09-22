package com.sherry.designpattern.behavior.templatemethod;

/**
 * https://www.jianshu.com/p/999519f11a80
 *  模板方法：
 * （1）一个抽象类中，有一个主方法，再定义1…n个方法，可以是抽象的，也可以是实际的方法，
 * （2）定义一个类，继承该抽象类，重写抽象方法
 * （3）抽象类中调用抽象方法，实现对子类中该方法的调用。
 *
 * 父类为虚拟类，定义各种顺序操作的接口，在各种具体子类中去实现
 * 多个类实现同一个方法，用策略
 * 多个类实现多个方法，先后有顺序，用模板方法
 *
 * @Author: Sherry
 * @Date: 2019/9/22 下午3:33
 */
public class TemplateMethod {
    public static void main(String [] args){
        AbstractTicket ticket = new TrainTicket();
        ticket.buyTicket();

        System.out.println("---------------------");
        ticket = new BusTicket();
        ticket.buyTicket();
    }
}
