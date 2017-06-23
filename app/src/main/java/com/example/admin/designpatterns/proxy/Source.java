package com.example.admin.designpatterns.proxy;


/**
 * @author Diana
 * @date 2017/6/23
 */

public class Source implements ISourceble {
    @Override
    public void method() {
        System.out.println("theoriginal method  !");
    }
}
