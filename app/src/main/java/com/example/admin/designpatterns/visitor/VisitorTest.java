package com.example.admin.designpatterns.visitor;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class VisitorTest {

    public static void main(String[] args) {
        Visitor visitor=new MyVisitor();
        Subject subject=new MySubject();
        subject.accept(visitor);
    }
}
