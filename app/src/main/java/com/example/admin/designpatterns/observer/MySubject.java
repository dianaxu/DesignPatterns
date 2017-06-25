package com.example.admin.designpatterns.observer;

/**
 * @author Diana
 * @date 2017/6/24
 */

public class MySubject extends AbstractSubject {

    //自身的操作
    @Override
    public void operation() {
        System.out.println("update self !");
        notifyObservers();
    }
}
