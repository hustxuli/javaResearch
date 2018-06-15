package com.sherry.designpattern.StaticFactory;


import java.util.concurrent.Executors;

public class FruitFactory {
    //Executor线程池使用这种方式
    private Executors executors;

    public static Fruit newApple(String name){
        return new Apple("red apple");
    }
    public static Fruit newBanana(String shape){
        return new Banana("long");
    }
}
