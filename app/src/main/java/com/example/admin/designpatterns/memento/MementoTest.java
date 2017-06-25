package com.example.admin.designpatterns.memento;

/**
 * Originall类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来
 * 保存value值。Memento类是备忘录类，Storage类是存储备忘录的类，持有
 * Memento类的实例。
 *
 * 新建原始类时，value初始化为egg，后经过修改；将value的值置为niu，
 * 最后倒数第二行进行恢复状态，结果成功恢复了。
 * @author Diana
 * @date 2017/6/24
 */

public class MementoTest {

    public static void main(String[] args) {
        //创建原始类
        Original origi = new Original("egg");

        //创建备忘录
        Storage storage = new Storage(origi.createMemento());

        //修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niuniu");
        System.out.println("修改后的状态为：" + origi.getValue());

        //回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }
}
