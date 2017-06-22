package com.example.admin.designpatterns.singleton;

/**
 * 这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程环境下，
 * 肯定会出问题，如何解决，请看{@link com.example.admin.designpatterns.singleton.Singleton2}
 * @author Diana
 * @date 2017/6/20
 */

public class Singleton {
    //持有私有静态实例，防止被引用，此处赋值为null,目的是实现延迟加载
    private static Singleton instance = null;

    //私有构造方法，防止被实例化
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve(){
        return  instance;
    }
}
