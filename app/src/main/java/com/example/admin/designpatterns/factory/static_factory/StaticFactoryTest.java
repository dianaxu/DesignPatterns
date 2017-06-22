package com.example.admin.designpatterns.factory.static_factory;

/**
 * 工厂模式-静态工厂方法模式
 * <p>
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用
 *
 * @author Diana
 * @date 2017/6/20
 */

public class StaticFactoryTest {

    public static void main(String args[]) {
        SendFactory.produceSms().send();
        System.out.println("\n");
        SendFactory.produceMail().send();
    }
}
