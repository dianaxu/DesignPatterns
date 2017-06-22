package com.example.admin.designpatterns.factory.ordinary_factory;

import com.example.admin.designpatterns.factory.ISender;
import com.example.admin.designpatterns.factory.MailSender;
import com.example.admin.designpatterns.factory.SmsSender;

/**
 * @author Diana
 * @date 2017/6/20
 */

public class SendFactory {
    public ISender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.print("请输入正确的类型");
            return null;
        }
    }
}


