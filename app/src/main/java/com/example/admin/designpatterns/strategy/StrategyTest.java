package com.example.admin.designpatterns.strategy;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();

        System.out.println("" + cal.calculate(exp));
        System.out.println("" + new Minus().calculate("10-4"));
        System.out.println("" + new Multiply().calculate("10*4"));
    }
}
