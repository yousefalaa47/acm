package max_and_min;

import java .util.* ;

public class Max_and_Min {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(c + " " + a);
            }
            else  {
                System.out.println(b + " " + a);
            }
        }
        else if (b > a && b >= c) {
            if (a >= c) {
                System.out.println(c + " " + b);
            }
            else {
                System.out.println(a + " " + b);
            }
        }
        else  {
            if (b >= a) {
                System.out.println(a + " " + c);
            }
            else {
                System.out.println(b + " " + c);
            }
        }
          
    }
    
}
