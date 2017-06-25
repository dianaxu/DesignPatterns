package com.example.admin.designpatterns.template_method;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
