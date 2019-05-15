package test;

import calculator.Calculator;

public class TestClass2 {

    public TestClass2(int test) {
        System.out.println("test");
    }

    public double division(double a, double b) {
        int c = new Calculator().extractedMethod(a, b);
        return a / b + c;
    }
}

