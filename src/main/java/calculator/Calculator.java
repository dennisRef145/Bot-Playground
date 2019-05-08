package calculator;

import java.util.Scanner;

public class Calculator extends SuperCalculator {

    public static final int MULTIPLIER = 10;

    public static void main(String[] args) {
        new Calculator().runProgram();
    }

    @Override
    public double addition(double a, double b) {
        int x1;
        int x2;
        x1 = 12;
        x2 = 13;
        int x3 = 14;
        int x4 = 15;
        int x5 = 16;
        int x6 = 17;
        int x7 = 18;
        int x8 = 19;
        x1 = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8;
        return a + b + x1;
    }

    public double additionClone(double a, double b) {
        int y1;
        int y2;
        y1 = 12;
        y2 = 13;
        int y3 = 14;
        int y4 = 15;
        int y5 = 16;
        int y6 = 17;
        int y7 = 18;
        int y8 = 19;
        y1 = y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8;
        return a + b + y1;
    }

    public double multiplication(double a, double b, double c) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return multiplication(a, b, 42);
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        int atest = 12;
        int c = this.extractedMethod(a, atest);
        return a / b + c;
    }

    public double divisionClone(double a, double b) {
        int atest = 13;
        int f;
        int c = this.extractedMethod(a, atest);
        return a / b + c;
    // test comment1
    // test comment2
    }

    public void runProgram() {
        println("The calculator is ready to calculate!");
        // get numbers
        Scanner inp = new Scanner(System.in);
        int num1;
        int num2;
        println("Enter first number:");
        num1 = inp.nextInt();
        println("Enter second number:");
        num2 = inp.nextInt();
        // get operation
        println("Enter your selection: 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        // calculate and print result
        switch(choose) {
            case 1:
                println("The result of the addition is:");
                println(addition(num1, num2));
                break;
            case 2:
                println("The result of the subtraction is:");
                println(subtraction(num1, num2));
                break;
            case 3:
                println("The result of the multiplication is:");
                println(multiplication(num1, num2));
                break;
            case 4:
                println("The result of the division is:");
                println(division(num1, num2));
                break;
            default:
                println("Illegal Operation");
        }
        inp.close();
        println("Thank you for using this awesome calculator.");
    }

    public void runProgramCloneTest() {
        println("The calculator is ready to calculate!");
        // get numbers
        Scanner inp = new Scanner(System.in);
        int num1;
        int num2;
        println("Enter first number:");
        num1 = inp.nextInt();
        println("Enter second number:");
        num2 = inp.nextInt();
        // get operation
        println("Enter your selection: 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        // calculate and print result
        switch(choose) {
            case 1:
                println("The result of the addition is:");
                println(addition(num1, num2));
                break;
            case 2:
                println("The result of the subtraction is:");
                println(subtraction(num1, num2));
                break;
            case 3:
                println("The result of the multiplication is:");
                println(multiplication(num1, num2));
                break;
            case 4:
                println("The result of the division is:");
                println(division(num1, num2));
                break;
            default:
                println("Illegal Operation");
        }
        inp.close();
        println("Thank you for using this awesome calculator.");
    }

    private void println(Object object) {
        // NOSONAR
        System.out.println(object);
    }

    private int extractedMethod(double a, int atest) {
        int c;
        int d;
        int e;
        int k;
        int j;
        c = 12 + (int) a;
        d = 13 + atest;
        e = 14;
        k = 15;
        j = 16;
        c = c + d + e + k + j;
        return c;
    }
}

