package com.example.admin.designpatterns.singleton;

/**
 * 另一种方式：
 * 因为我们只需要在创建类的时候进行同步，所以只要在创建和getInstance（）分开，
 * 单独为创建加synchronized关键字；
 *
 * 考虑性能的话，整个程序只需要创建一次实例，所以性能也不会有什么影响。
 * @author Diana
 * @date 2017/6/20
 */

public class Singleton5 {
    //持有私有静态实例，防止被引用，此处赋值为null,目的是实现延迟加载
    private static Singleton5 instance = null;

    //私有构造方法，防止被实例化
    private Singleton5() {
    }

    private static synchronized void syncInit(){
        if (instance!=null){
            instance=new Singleton5();
        }
    }


    public static Singleton5 getInstance() {
        if (instance == null) {
           syncInit();
        }
        return instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve(){
        return  instance;
    }
}
