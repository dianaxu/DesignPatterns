package com.example.admin.designpatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * 原型模式--原型类
 *
 * <p>
 * 深浅复制例子
 * 要实现深复制，需要采用流的形式读入当前的二进制输入，再写出二进制数据对应的对象。
 *
 */

public class Prototype2 implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String string;
    private SerializableObject obj;
    private List<String> list;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    /**
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype2 proto = (Prototype2) super.clone();
        return proto;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Prototype2{" +
                "string='" + string + '\'' +
                ", obj=" + obj +
                ", list=" + list +
                '}';
    }
}
