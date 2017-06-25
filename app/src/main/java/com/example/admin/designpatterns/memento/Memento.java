package com.example.admin.designpatterns.memento;

/**
 * @author Diana
 * @date 2017/6/24
 */

public class Memento {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }
}
