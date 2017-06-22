package com.example.admin.designpatterns.factory.ordinary_factory;


import com.example.admin.designpatterns.factory.ISender;

/**
 * 工厂方法模式-普通工厂模式
 * <p>
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * 例：发送邮件和短信的例子
 *
 * @author Diana
 * @date 2017/6/20
 */

public class OrdinaryFactoryTest {

    public static void main(String args[]) {
        SendFactory factory = new SendFactory();
        ISender sender = factory.produce("sms");
        sender.send();

        System.out.println("\n");

        ISender sender1 = factory.produce("mail");
        sender1.send();
    }
}




