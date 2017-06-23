package com.example.admin.designpatterns.proxy;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class ProxyTest {
    public static void main(String[] args) {
        ISourceble sourceble = new Proxy();
        sourceble.method();
    }
}
