package com.example.admin.designpatterns.responsibility;

/**
 * @author Diana
 * @date 2017/6/24
 */

public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }

    }
}
