package com.example.admin.designpatterns.facade;

/**
 * 如果没有Computer类，那么CPU，Memory，Disk他们之间将会互相持有实例，
 * 产生关系，这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，
 * 这不是我们想要看到的，有了computer类他们之间的关系被放在了computer类里，
 * 这样就起到了解耦的作用
 * * @author Diana
 * @date 2017/6/23
 */

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished");
    }

    public void shutdown() {
        System.out.println("begin to close the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed");
    }
}
