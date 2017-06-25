package com.example.admin.designpatterns.Iterator;

/**
 * @author Diana
 * @date 2017/6/24
 */

public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
