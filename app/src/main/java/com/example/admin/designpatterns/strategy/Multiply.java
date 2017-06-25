package com.example.admin.designpatterns.strategy;

/**
 * 乘法
 * @author Diana
 * @date 2017/6/23
 */

public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}
