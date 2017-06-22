package com.example.admin.designpatterns.singleton;

import java.util.Vector;

/**
 * 单例模式--简单实例
 * <p>
 * 是一种常见的设计模式。在java应用中，单列对象能保证在一个jvm中，
 * 该对象只有一个实例存在
 *
 * @author Diana
 * @date 2017/6/20
 */

public class SingletonTest {

    private static SingletonTest instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingletonTest() {
    }

    private static void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonTest shadow = new SingletonTest();
        properties = shadow.getProperties();
    }
}
