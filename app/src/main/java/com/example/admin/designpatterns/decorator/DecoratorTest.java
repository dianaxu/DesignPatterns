package com.example.admin.designpatterns.decorator;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class DecoratorTest {
    public static void main(String[] args) {
        ISourceable source=new Source();
        ISourceable obj=new Decorator(source);
        obj.method();

    }
}
