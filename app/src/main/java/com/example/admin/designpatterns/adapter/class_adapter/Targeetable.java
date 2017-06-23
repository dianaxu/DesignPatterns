package com.example.admin.designpatterns.adapter.class_adapter;

/**
 *  Targetable接口的实现类就具有了Source类的功能，又有新功能
 * @author Diana
 * @date 2017/6/22
 */

public interface Targeetable {

    //与原类中的方法相同
    void method1();

    //新类的方法
    void method2();
}
