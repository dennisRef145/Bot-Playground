package calculator;

public class TestClass {

    public TestClass(int test1, int test2) {
        System.out.println("test");
    }

    public void simpleMethod() {
    	int a = 0;
        int[] b = {2 , 3, 4, 6};

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
        int atest = 12;
        int c;
        int d;
        int e;
        int etest = 12;
        boolean test = true;
        String test2 = "testtest";
        int k;
        int j;
        c = 12 + (int)a;
        for (int i = 0; i < 10; i++) {
            c++;
            if (c > 16) {
                break;
            }
        }
        d = 13 + atest + etest;
        e = 14;
        k = 15;
        j = 16;
        c = c + d + e + k + j;
        return a / b + c;
    }
}