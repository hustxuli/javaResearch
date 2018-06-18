package com.sherry.designpattern.structure.decorator;

/**
 * @Author: Sherry
 * @Date: 2018/6/18 下午4:11
 *
 * 装饰器模式
 *  在一个原有的类的上增加额外的功能，前提是不能修改类的代码。
 *  其实为一个类增加功能，可以用继承来实现，但是这样会使得类的数量层爆炸式增长，每增加一个功能，都会通过继承生成一个新类
 *
 * 场景：
 * 1.动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 *
 * 2.继承和装饰模式的对比：如果用继承实现原来功能的扩展，如果拓展功能多，会生成很多子类，增加系统复杂性。
 *  而且继承是编译时确定的，静态的，必须编码阶段预见拓展这些功能
 *
 */
public class Decorator {
    public static void main(String [] args){
        Coffee coffee = new NormalCoffee();//普通咖啡
        System.out.println(coffee.getName() + ": ￥"+coffee.getPrice());

        coffee = new Milk(coffee);//加奶
        System.out.println(coffee.getName() + ": ￥"+coffee.getPrice());

        coffee = new Sugar(coffee);//加奶加糖
        System.out.println(coffee.getName() + ": ￥"+coffee.getPrice());
    }
}
