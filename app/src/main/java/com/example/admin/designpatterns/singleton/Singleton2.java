package com.example.admin.designpatterns.singleton;

/**
 * 多线程环境下，我们首先想到对getInstance方法加synchronized关键字;
 * 但是synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
 * 因为每次调用getInstance(),都要对对象上锁，事实上，只有在第一次创建对象的时候
 * 加锁，之后就不需要了，所以查看{@link com.example.admin.designpatterns.singleton.Singleton3}
 *
 * @author Diana
 * @date 2017/6/20
 */

public  class Singleton2 {
    //持有私有静态实例，防止被引用，此处赋值为null,目的是实现延迟加载
    private static Singleton2 instance = null;

    //私有构造方法，防止被实例化
    private Singleton2() {
    }

    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve(){
        return  instance;
    }
}
