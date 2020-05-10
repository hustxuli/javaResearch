package com.sherry.designpattern.behavior.event.impl;

import com.sherry.designpattern.behavior.event.Event;
import com.sherry.designpattern.behavior.event.Listener;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher没有父类了，Teacher作为事件中的事件源Source被封装到HomeworkEvent中了。
 * 这没有什么不好的，业务对象和框架代码隔离开来，解耦的非常好，
 * 但是正因为如此，我们需要在Teacher中自己维护一个Student的列表，于是，我们看到了listenerList这个变量
 *
 * @Author: Sherry
 * @Date: 2019/9/22 下午5:05
 */
@Data
public class Teacher {
    private String name;
    private Set<Listener> listenerSet;

    public Teacher(String name){
        this.name = name;
        listenerSet = new HashSet<>();
    }

    public void setHomework(String homework) {
        System.out.printf("老师布置了作业'%s' \n", homework);

        HomeworkEvent event = new HomeworkEvent(this);
        /*
         * 在观察者模式中，我们直接调用Observable的notifyObservers来通知被观察者
         * 现在我们只能自己通知了~~
         */
        notifyEveryListener(event,homework);

    }

    public void addListener(Listener listener){
        listenerSet.add(listener);
    }

    public void delListener(Listener listener){
        listenerSet.remove(listener);
    }

    public void notifyEveryListener(Event event,Object arg){
        for (Listener listener : listenerSet) {
            listener.update(event, arg);
        }
    }




}
