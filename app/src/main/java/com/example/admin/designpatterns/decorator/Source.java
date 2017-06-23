package com.example.admin.designpatterns.decorator;



/**
 * @author Diana
 * @date 2017/6/23
 */

public class Source implements ISourceable {
    @Override
    public void method() {
        System.out.println("the original method !");
    }
}
