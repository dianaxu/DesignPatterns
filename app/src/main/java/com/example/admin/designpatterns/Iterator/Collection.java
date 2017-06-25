package com.example.admin.designpatterns.Iterator;

/**
 * @author Diana
 * @date 2017/6/24
 */

public interface Collection {

    Iterator iterator();

    //取得集合元素
    Object get(int i);

    //取得集合大小
    int size();
}
