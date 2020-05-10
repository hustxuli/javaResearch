package com.sherry.designpattern.behavior.event;

import com.sherry.designpattern.behavior.event.impl.Student;
import com.sherry.designpattern.behavior.event.impl.Teacher;

/**
 * 事件驱动模式(又叫"事件派发器模式"、"事件委托模式")
 * https://www.jianshu.com/p/1b716d80c82c
 * https://www.jianshu.com/p/724e5814f78b
 *
 * 
 * https://www.jb51.net/article/121117.htm
 *
 *
 * 事件驱动模式是观察者模式的升级版
 * 观察者模式中：
 * 被观察者(必须实现Subject(即Observable)接口，在接口中主动通知 观察者)：老师
 * 观察者：学生
 *
 *
 * 弊病：
 *
 * 事件驱动隔膜式中：
 * 事件源：老师（被观察者）
 * 事件：将事件源塞入其source变量
 * 监听器接口：java.util.EventListener
 * 具体监听器：学生
 *
 *
 *
 *
 * @Author: Sherry
 * @Date: 2019/9/22 下午4:11
 */
public class EventMain {
    public static void main(String [] args){

        Teacher teacher = new Teacher("马云");
        Listener listener1 = new Student("张三");
        Listener listener2 = new Student("李四");
        Listener listener3 = new Student("王五");

        teacher.addListener(listener1);
        teacher.addListener(listener2);
        teacher.addListener(listener3);
        teacher.setHomework("英语作业");//在setHomework中notifyEveryListener

        System.out.println("----------------");
        teacher.delListener(listener2);
        teacher.setHomework("数学作业");

    }
}
