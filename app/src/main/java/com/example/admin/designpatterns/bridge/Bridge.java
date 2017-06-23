package com.example.admin.designpatterns.bridge;

/**
 * 定义一个桥，持有Sourceable的一个实例
 * @author Diana
 * @date 2017/6/23
 */

public abstract class Bridge  {
    private ISourceable source;

    public void method(){
        source.method();
    }

    public ISourceable getSource() {
        return source;
    }

    public void setSource(ISourceable source) {
        this.source = source;
    }
}
