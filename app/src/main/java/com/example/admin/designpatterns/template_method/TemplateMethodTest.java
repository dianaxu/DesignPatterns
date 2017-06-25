package com.example.admin.designpatterns.template_method;

/**
 * 执行过程：首先将exp和"\\+"做参数，调用AbstractCalculator类里的
 * calculate（String，String）方法，在calculate（String，String）里调用同类的
 * split();之后再调用calculate(int,int)方法，从这个方法进入到子类中，执行完
 * return num1+num2后，将值返回到AbstractCalculator类，赋给result，打印出来，
 * 正好验证了我们开头的思路；
 *
 * @author Diana
 * @date 2017/6/23
 */

public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractCalculator cal = new Plus();
        int result = cal.calculate("8+8", "\\+");
        System.out.println("" + result);

    }
}
