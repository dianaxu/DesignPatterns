package com.example.admin.designpatterns.adapter.interface_adapter;

/**
 * @author Diana
 * @date 2017/6/22
 */

public class SourceSub1 extends Wrapper2 {
    @Override
    public void method1() {
        System.out.println("the sourceable interface's first sub1 !");
    }
}
