package com.example.admin.designpatterns.bridge;

/**
 * 通过对Bridge类的调用，实现了对接口ISourceable的实现类SourceSub1和
 * SourceSub2的调用。
 * @author Diana
 * @date 2017/6/23
 */

public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        //调用第一个对象
        ISourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        //调用第二个对象
        ISourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
