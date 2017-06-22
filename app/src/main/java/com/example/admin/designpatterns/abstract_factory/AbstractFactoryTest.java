package com.example.admin.designpatterns.abstract_factory;

import com.example.admin.designpatterns.factory.ISender;

/**
 * 抽象工厂模式
 * 如果需要增加新的功能，直接增加新的工厂类就可以了
 * @author Diana
 * @date 2017/6/20
 */

public class AbstractFactoryTest {
    public static void main(String args[]) {
        new SendSmsFactory().produce();

        System.out.println("\n");

        new SendMailFactory().produce();
    }
}
