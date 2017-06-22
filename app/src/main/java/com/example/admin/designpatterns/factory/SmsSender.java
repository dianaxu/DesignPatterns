package com.example.admin.designpatterns.factory;

import com.example.admin.designpatterns.factory.ordinary_factory.SendFactory;

/**
 * @author Diana
 * @date 2017/6/20
 */

public class SmsSender implements ISender {
    @Override
    public void send() {
        System.out.print("this is SmsSender");
    }
}