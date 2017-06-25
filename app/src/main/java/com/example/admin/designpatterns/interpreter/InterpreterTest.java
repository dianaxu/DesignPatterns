package com.example.admin.designpatterns.interpreter;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class InterpreterTest {
    public static void main(String[] args) {
        //计算9+2-8
        int result = new Minus().interpret(new Context(
                new Plus().interpret(new Context(9, 2)),
                8));
        System.out.println("" + result);
    }
}
