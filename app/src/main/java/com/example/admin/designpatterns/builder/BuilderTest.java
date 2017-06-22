package com.example.admin.designpatterns.builder;

/**
 * 建造者模式
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西，
 * 所以与工厂模式的区别是：
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部件。
 * 因此，是选择工厂模式还是建造者模式，依实际情况而定
 * @author Diana
 * @date 2017/6/22
 */

public class BuilderTest {

    public static void main(String args[]) {
        Builder builder = new Builder();
        builder.produceMailSender(5);

        System.out.println("\n");

        builder.produceSmsSender(5);
    }
}
