package com.kodilla.testing.calculator;

public class Calculator {
    public int a;
    public int b;


    public Calculator(int a, int b) {
           this.a = a;
           this.b = b;
    }

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractBFromA(int a, int b) {
        return a - b;
    }
}
