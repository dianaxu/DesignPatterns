package com.example.admin.designpatterns.proxy;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class Proxy implements ISourceble {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after proxy");
    }

    private void before() {
        System.out.println("before proxy");
    }
}
