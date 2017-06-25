package com.example.admin.designpatterns.command;

/**
 * Invoker是调用者（司令员），Receiver是被调用者（士兵），MyCommand是命令，
 * 实现了Command接口，持有接收对象。
 * @author Diana
 * @date 2017/6/24
 */

public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
