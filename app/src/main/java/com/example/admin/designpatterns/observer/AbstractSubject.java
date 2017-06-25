package com.example.admin.designpatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Diana
 * @date 2017/6/24
 */

public abstract class AbstractSubject implements ISubject {
    private Vector<IObserver> vector = new Vector<>();

    @Override
    public void add(IObserver observer) {
        vector.add(observer);
    }

    @Override
    public void del(IObserver observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<IObserver> elements = vector.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
