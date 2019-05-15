package calculator;

import java.util.Scanner;
import calculator.TestClass;

public class Calculator extends SuperCalculator {

    public static final int MULTIPLIER = 10;

    public static void main(String[] args) {
        new Calculator().runProgram();
    }

    @Override
    public double addition(double a, double b) {
        int x1 = 12;
        return a + b + x1;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        int c = new TestClass(nulltest1,nulltest2).extractedMethod(a, b);
        return a / b + c;
    }

    public double divisionClone(double a, double b) {
        int atest = 13;
        int f;
        int c;
        int d;
        int e;
        int etest = 13;
        boolean test = true;
        String test2 = "test";
        int k;
        int j;
        c = 12 + (int) a;
        for (int i = 0; i < 11; i++) {
            c++;
            if (c > 16) {
                break;
            }
        }
        d = 13 + atest + etest;
        e = 14;
        // test comment1
        // test comment2
        // test comment3
        k = 15;
        j = 16;
        // test comment 2
        c = c + d + e + k + j;
        return a / b + c;
    }

    public void runProgram() {
        println("The calculator is ready to calculate!");
        int a = 12;
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
        int a = 13;
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
}

