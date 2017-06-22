package com.example.admin.designpatterns.factory.static_factory;

import com.example.admin.designpatterns.factory.ISender;
import com.example.admin.designpatterns.factory.MailSender;
import com.example.admin.designpatterns.factory.SmsSender;

/**
 * @author Diana
 * @date 2017/6/20
 */

public class SendFactory {
    public static ISender produceMail() {
        return new MailSender();
    }

    public static ISender produceSms() {
        return new SmsSender();
    }
}
