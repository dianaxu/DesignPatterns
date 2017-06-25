package com.example.admin.designpatterns.visitor;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject : " + sub.getSubject());
    }
}
