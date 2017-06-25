package com.example.admin.designpatterns.visitor;

/**
 * @author Diana
 * @date 2017/6/25
 */

public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}
