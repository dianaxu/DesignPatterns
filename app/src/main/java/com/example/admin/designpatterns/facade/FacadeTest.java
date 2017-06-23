package com.example.admin.designpatterns.facade;

/**
 * 外观模式
 * <p>
 * 以一个计算机的启动过程为例
 *
 * @author Diana
 * @date 2017/6/23
 */

public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
