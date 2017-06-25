package com.example.admin.designpatterns.observer;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class Observer2 implements IObserver {
    @Override
    public void update() {
        System.out.println("onserver2 has received !");
    }
}
