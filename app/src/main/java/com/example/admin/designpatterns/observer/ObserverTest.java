package com.example.admin.designpatterns.observer;

/**
 * MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject
 * 的对象，当MySubject变化时，Observer1和Observer2必然变化。
 * AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：
 * 增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
 *
 * @author Diana
 * @date 2017/6/24
 */

public class ObserverTest {
    public static void main(String[] args) {
        ISubject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
