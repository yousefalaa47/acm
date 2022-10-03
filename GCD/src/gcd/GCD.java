package gcd;

import java .util.* ;
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x < y) {
            for (int i = x; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
        if (y < x) {
            for (int i = y; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
        if (x == y) {
            System.out.println(x);
            System.exit(0);
        }
    }
    
}
