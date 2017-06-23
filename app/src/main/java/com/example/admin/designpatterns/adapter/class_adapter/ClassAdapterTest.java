package com.example.admin.designpatterns.adapter.class_adapter;

/**
 * 适配器模式——类的适配模式
 *
 * @author Diana
 * @date 2017/6/22
 */

public class ClassAdapterTest {
    public static void main(String args[]) {
        Targeetable targeetable = new Adapter();
        targeetable.method1();
        targeetable.method2();
    }
}
