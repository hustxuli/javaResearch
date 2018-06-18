package com.sherry.designpattern.create.abstractfactory;

/**
 * @Author: Sherry
 * @Date: 2018/6/17 下午2:42
 *
 * 查看FruitAbstractFactory类：假设苹果厂盛产果汁，香蕉厂盛产牛奶，两者均为Drinks
 * 查看staticfactory.Fruit类，我们不想把所有的产品信息，都塞到staticfactory.Fruit类中，
 * 因此剥离出Drinks产品
 *
 * 优点:
 * 把具体产品的创建延迟到具体子类工厂中。
 *
 * 缺点:
 * 如果需要添加新产品，需要修改抽象工厂FruitAbstractFactory，添加新产品创建方法，
 * 如果只有A子类工厂想添加此产品，修改了父类FruitAbstractFactory，那么B、C、子类工厂不得不也添加此产品，违背了开发-封闭原则
 */
public class AbstractFactory {
    public static void main(String [] args){
        FruitAbstractFactory factory = new AppleAbstractFactory();
        AbstractProduct product = factory.createFruit();
        System.out.println(product.getProductName());

        product = factory.createDrinks();
        System.out.println(product.getProductName());
    }
}
