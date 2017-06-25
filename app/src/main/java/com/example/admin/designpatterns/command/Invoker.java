package com.example.admin.designpatterns.command;

/**
 * @author Diana
 * @date 2017/6/24
 */

public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
