package com.example.admin.designpatterns.interpreter;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
