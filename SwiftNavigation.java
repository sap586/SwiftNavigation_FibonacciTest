//The output for F(n) = 3 and F(n) = 5 are
//"Buzz" and "Fizz" respectively, even though
//they both are prime. The output can easily be
//modified as required.

import java.util.Scanner;

class SwiftNavigation {
    static int a = 0;
    static int b = 1;
    static String s1 = "Buzz";
    static String s2 = "Fizz";
    static void print() {
        if ((a+b)%3 == 0) {
            System.out.print(s1);
        } else if ((a+b)%5 == 0) {
            System.out.print(s2);
        } else if ((a+b)%15 == 0) {
            System.out.print(s2+s1);
        } else if ((a+b) >=2 && primeOrNot(a+b)) {
            System.out.print(s1+s2);
        }
        System.out.println(a+b);
        int c = b;
        b = a + b;
        a = c;
    }
    static boolean primeOrNot(int n) {
        for (int i=2; i<= Math.sqrt(n); i++) {
            if ((n%i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int i = 2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(a);
        }
        if (n > 1) {
            System.out.println(b);
        }
        if (n > 2) {
            while(i < n) {
                print();
                i++;
            }
        }
    }
}
