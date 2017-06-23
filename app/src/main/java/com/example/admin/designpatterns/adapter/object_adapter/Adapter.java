package com.example.admin.designpatterns.adapter.object_adapter;

import com.example.admin.designpatterns.adapter.Source;
import com.example.admin.designpatterns.adapter.class_adapter.Targeetable;

/**
 * @author Diana
 * @date 2017/6/22
 */

public class Adapter implements Targeetable {
    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        if (source != null) {
            source.method1();
        }
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method !");
    }
}
