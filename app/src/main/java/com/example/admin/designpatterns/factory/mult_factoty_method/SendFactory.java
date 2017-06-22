package com.example.admin.designpatterns.factory.mult_factoty_method;

import com.example.admin.designpatterns.factory.ISender;
import com.example.admin.designpatterns.factory.MailSender;
import com.example.admin.designpatterns.factory.SmsSender;

/**
 * 多个工厂方法模式-创建工厂类
 *
 * @author Diana
 * @date 2017/6/20
 */

public class SendFactory {
    public ISender produceSms() {
        return new SmsSender();
    }

    public ISender produceMail() {
        return new MailSender();
    }
}
