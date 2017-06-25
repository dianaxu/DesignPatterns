package com.example.admin.designpatterns.memento;

/**
 * 备忘录
 * @author Diana
 * @date 2017/6/24
 */

public class Storage {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Storage(Memento memento) {
        this.memento = memento;
    }
}
