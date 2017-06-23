package com.example.admin.designpatterns.adapter.object_adapter;

import com.example.admin.designpatterns.adapter.Source;
import com.example.admin.designpatterns.adapter.class_adapter.Targeetable;

/**
 * @author Diana
 * @date 2017/6/22
 */

public class ObjectAdapterTest {
    public static void main(String args[]) {
        Source source = new Source();
        Targeetable targeetable = new Adapter(source);
        targeetable.method1();
        targeetable.method2();
    }
}
