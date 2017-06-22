package com.example.admin.designpatterns.singleton;

/**
 *似乎解决了之前提到的问题，将sychronized关键字加载内部，也就是说当调用的时候是不需要加锁的
 * 只有在instance为null,并创建对象的时候才需要加锁，性能有一定的提升。但是，这样的情况，
 * 还是有可能有问题的，看下面的情况：
 * 在java指令中穿件对象和赋值操作是分开进行的，也就是说instance=new Singleton（）；语句
 * 是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton
 * 实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错
 *我们以A、B两个线程为例：

 a>A、B线程同时进入了第一个if判断

 b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();

 c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，
 并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。

 d>B进入synchronized块，由于instance此时不是null，
 因此它马上离开了synchronized块并将结果返回给调用该方法的程序。

 e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
 因此我们对该程序做进一步优化,请看{@link Singleton4}
 * @author Diana
 * @date 2017/6/20
 */

public class Singleton3 {
    //持有私有静态实例，防止被引用，此处赋值为null,目的是实现延迟加载
    private static Singleton3 instance = null;

    //私有构造方法，防止被实例化
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance){
                if (instance==null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve(){
        return  instance;
    }
}
