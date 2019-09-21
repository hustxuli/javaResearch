package com.sherry.designpattern.behavior.observer.impl;

import com.sherry.designpattern.behavior.observer.Observer;
import com.sherry.designpattern.behavior.observer.Subject;
import lombok.Data;

import java.util.Vector;

/**
 * @Author: Sherry
 * @Date: 2019/9/21 下午2:21
 */
@Data
public abstract class AbstractSubject implements Subject{
    private Vector<Observer> observers;
    public AbstractSubject(){
        this.observers = new Vector<>();
    }

    @Override
    public void addObserver(Observer observer){
        if(null != this.observers && !this.observers.contains(observer)){
            this.observers.add(observer);
        }
    }

    @Override
    public void delObserver(Observer observer){
        if(null != this.observers && this.observers.contains(observer)){
            observers.remove(observer);
        }
    }

    /**
     * 更新参数
     * @param arg
     */
    @Override
    public void notifyEveryObserver(Object arg){
        for(int i=0;i<observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(this,arg);
        }
    }


    @Override
    public void process(){
        String msg = doMyBusiness();
        notifyEveryObserver(msg);
    }

}
