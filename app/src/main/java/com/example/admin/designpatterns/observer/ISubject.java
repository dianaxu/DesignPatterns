package com.example.admin.designpatterns.observer;

/**
 * @author Diana
 * @date 2017/6/24
 */

public interface ISubject {
    //增加观察者
    void add(IObserver observer);

    //删除观察者
    void del(IObserver observer);

    //通知所有的观察者
    void notifyObservers();

    //自身的操作
    void operation();
}
