package com.example.admin.designpatterns.responsibility;

/**
 * @author Diana
 * @date 2017/6/24
 */

public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
