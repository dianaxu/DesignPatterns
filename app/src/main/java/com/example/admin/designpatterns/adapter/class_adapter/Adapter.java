package com.example.admin.designpatterns.adapter.class_adapter;

import com.example.admin.designpatterns.adapter.Source;

/**
 * Adapter 类继承Source类，实现Targetable接口
 *
 *
 * @author Diana
 * @date 2017/6/22
 */

public class Adapter extends Source implements Targeetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method !");
    }
}
