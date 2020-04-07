package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        Calculator calculator = new Calculator(a,b);
        Integer result1 = calculator.addAToB(a,b);
        Integer result2 = calculator.subtractBFromA(a,b);

        if (result1 == a+b){
            System.out.println("test result1 OK");
        } else {
            System.out.println("result1 Error!");
        }
        if (result2 == a-b){
            System.out.println("test result2 OK");
        } else {
            System.out.println("result2 Error!");
        }

    }
}