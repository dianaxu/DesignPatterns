package com.example.admin.designpatterns.builder;

import com.example.admin.designpatterns.factory.ISender;
import com.example.admin.designpatterns.factory.MailSender;
import com.example.admin.designpatterns.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式--建造者
 * 需要用到前面，一个ISender接口{@link com.example.admin.designpatterns.factory.ISender}，
 * 两个实现类
 * MailSender{@link com.example.admin.designpatterns.factory.MailSender}和
 * SmsSender{@link com.example.admin.designpatterns.factory.SmsSender}
 *
 * @author Diana
 * @date 2017/6/22
 */

public class Builder {
    private List<ISender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
