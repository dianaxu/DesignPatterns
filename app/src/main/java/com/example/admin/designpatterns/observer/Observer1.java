package com.example.admin.designpatterns.observer;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class Observer1 implements IObserver {
    @Override
    public void update() {
        System.out.println("observer1 has received");
    }
}
