package com.example.admin.designpatterns.bridge;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
