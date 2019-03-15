package calculator;

public class TestClass {
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

        System.out.println(b);

        int ac = 0;
        int bc = 1;

        if (ac == bc) {
            bc = 2;
        }

        System.out.println(bc);
        
        int ad = 0;
        int bd = 1;

        if (ad == bd) {
            bd = 2;
        } else {
            ad = 2;
        }

        System.out.println(bd);
        
        int af = 0;
        int bf = 1;

        switch (af) {
            case 0:
                bf = af;
                break;
            case 1:
                bf = 69;
                break;
            case 2:
                bf = 42;
                break;
            default:
                bf = 1000;
                break;
        }

        System.out.println(bf);
    }
}