package com.example.admin.designpatterns.strategy;

/**
 *  减法
 * @author Diana
 * @date 2017/6/23
 */

public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
