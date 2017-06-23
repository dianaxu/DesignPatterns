package com.example.admin.designpatterns.bridge;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class SourceSub2 implements ISourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
