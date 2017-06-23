package com.example.admin.designpatterns.decorator;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class Decorator implements ISourceable {
    private ISourceable source;

    public Decorator(ISourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator !");
        source.method();
        System.out.println("after decorate !");
    }
}
