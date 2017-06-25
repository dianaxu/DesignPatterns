package com.example.admin.designpatterns.visitor;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
