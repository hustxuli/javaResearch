package com.sherry.designpattern.create.staticfactory;


import java.util.concurrent.Executors;

public class FruitFactory {
    //Executor线程池使用这种方式
    private Executors executors;

    public static Fruit createApple(String name){
        return new Apple("red apple");
    }
    public static Fruit createBanana(String shape){
        return new Banana("long");
    }
}
