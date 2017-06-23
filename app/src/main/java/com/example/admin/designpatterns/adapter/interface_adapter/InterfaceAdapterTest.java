package com.example.admin.designpatterns.adapter.interface_adapter;

/**
 * @author Diana
 * @date 2017/6/22
 */

public class InterfaceAdapterTest {
    public static void main(String[] args) {
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
