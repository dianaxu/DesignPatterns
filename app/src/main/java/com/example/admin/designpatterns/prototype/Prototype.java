package com.example.admin.designpatterns.prototype;

/**
 * 原型模式--原型类
 *
 * 一个原型类，只需要实现Cloneable接口，覆写clone方法，此处clone方法
 * 可以任意改名，因为Cloneable接口是个空接口，你可以任意定义实现类的
 * 方法名，因为此处的重点是super.clone（）这句话，super.clone（）
 * 调用的是Object的clone方法，而在Object类中，clone（）是native的，
 * @author Diana
 * @date 2017/6/22
 */

public class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
}
