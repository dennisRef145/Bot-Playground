package calculator;

import calculator.Calculator;

public class TestClass {

    public TestClass(int test1, int test2) {
        System.out.println("test");
    }

    public void simpleMethod() {
        int a = 0;
        int[] b = { 2, 3, 4, 6 };
        // this is a test
        for (int c : b) {
            a += c;
            System.out.println(a);
            if (a == 10) {
                break;
            }
        }
    }

    public double division(double a, double b) {
        int c = new Calculator().extractedMethod(a, b);
        return a / b + c;
    }
}

