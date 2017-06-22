package com.example.admin.designpatterns.abstract_factory;

import com.example.admin.designpatterns.factory.ISender;
import com.example.admin.designpatterns.factory.SmsSender;

/**
 * @author Diana
 * @date 2017/6/20
 */

public class SendSmsFactory  implements IProvider{
    @Override
    public ISender produce() {
        return new SmsSender();
    }
}
