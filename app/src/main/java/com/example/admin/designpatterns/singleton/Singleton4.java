package com.example.admin.designpatterns.singleton;

/**
 * 这并不是完美的，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
 * 我们只能根据实际情况，选择合适自己应用场景的实现方法。
 * @author Diana
 * @date 2017/6/20
 */

public class Singleton4 {
    //持有私有静态实例，防止被引用，此处赋值为null,目的是实现延迟加载
    private static Singleton4 instance = null;

    //私有构造方法，防止被实例化
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonFactory.instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {
        return instance;
    }


    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static Singleton4 instance = new Singleton4();
    }
}
