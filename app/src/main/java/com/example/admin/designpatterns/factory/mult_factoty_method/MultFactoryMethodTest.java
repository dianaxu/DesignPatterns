package com.example.admin.designpatterns.factory.mult_factoty_method;

import com.example.admin.designpatterns.factory.ISender;

/**
 * 工厂模式-多个工厂方法模式
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 *
 * @author Diana
 * @date 2017/6/20
 */

public class MultFactoryMethodTest {

    public static void main(String args[]) {
        SendFactory factory = new SendFactory();
        ISender smsSender = factory.produceSms();
        smsSender.send();

        System.out.println("\n");

        ISender mailSender = factory.produceMail();
        mailSender.send();
    }
}
