package calculator;

public class TestClass {
    public void simpleMethod() {
    	int c = 12;
    	int d = 13;
    	
    	if (c + d > 20) {
    		System.out.println("1");
        	System.out.println("2");
        	System.out.println("3");
    	}
    	
    	int e = 10;
    	int f = 3;
    	
    	if (e * f > 20) {
    		System.out.println("4");
        	System.out.println("5");
        	System.out.println("6");
    	}
    	
    	// test
    	System.out.println("7");
    	
    	int y = 12;
    	int x = 19;
    	
    	if (x - y < 20) {
    		System.out.println("8");
        	System.out.println("9");
    	}
    	
    	int g = 10;
    	int h = 2;
    	
    	if (g * h > 15) {
    		System.out.println("10");
    	}

        int a = 0;
        int b = 1;

        if (a == b) {
            b = 2;
        }

        System.out.println(b);
    }
}