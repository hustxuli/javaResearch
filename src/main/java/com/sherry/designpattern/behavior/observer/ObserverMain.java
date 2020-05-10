package com.sherry.designpattern.behavior.observer;

import com.sherry.designpattern.behavior.observer.impl.Student;
import com.sherry.designpattern.behavior.observer.impl.Teacher;


/**
 * 观察者模式(Observer Pattern)：定义对象间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。
 * 被观察者Subject
 * 观察者Observer
 * https://blog.csdn.net/mbshqqb/article/details/78615152
 * 观察者模式与发布订阅（Publish/Subscribe）模式的区别：https://blog.csdn.net/u014168594/article/details/82884968
 * @Author: Sherry
 * @Date: 2019/9/21 下午2:12
 */
public class ObserverMain {
    public static void main(String [] args){
        Subject subject = new Teacher("马云");
        Observer observer1 = new Student("张三");
        Observer observer2 = new Student("李四");
        Observer observer3 = new Student("王五");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.process();//在process中notifyEveryObserver

        System.out.println("----------------");
        subject.delObserver(observer2);
        subject.process();

    }
}
