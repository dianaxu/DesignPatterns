package com.example.admin.designpatterns.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式
 *
 * 将一个对象作为原型，对其进行复制，克隆，产生一个和原对象累死的新对象
 * @author Diana
 * @date 2017/6/22
 */

public class PrototypeTest {

    public static void main(String args[]) throws CloneNotSupportedException,
            IOException, ClassNotFoundException {
        Prototype2 prototype2 = new Prototype2();
        prototype2.setString("test");
        SerializableObject object = new SerializableObject();
        prototype2.setObj(object);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        prototype2.setList(list);

        Prototype2 protclone = (Prototype2) prototype2.clone();
        Prototype2 protdeep = (Prototype2) prototype2.deepClone();

        System.out.println("clone string:" + (prototype2.getString() == protclone.getString()));
        System.out.println("clone obj:" + (protclone.getObj() == prototype2.getObj()));
        System.out.println("\n");
        System.out.println("deepclone string:" + (prototype2.getString() == protdeep.getString()));
        System.out.println("deepclone obj:" + (protdeep.getObj() == prototype2.getObj()));
    }
}
