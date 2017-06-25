package com.example.admin.designpatterns.Iterator;

/**
 * @author Diana
 * @date 2017/6/24
 */

public interface Iterator {
    //前移
    Object previous();

    //后移
    Object next();

    boolean hasNext();

    //取得第一个元素
    Object first();
}
