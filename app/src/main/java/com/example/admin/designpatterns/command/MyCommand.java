package com.example.admin.designpatterns.command;

/**
 * @author Diana
 * @date 2017/6/24
 */

public class MyCommand implements ICommand {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
