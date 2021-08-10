package hard_compare;

import java .util.* ;
public class Hard_Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = input.nextLong();
        if (b * Math.log(a) > d * Math.log(c) ) 
            System.out.println("YES"); 
        else
            System.out.println("NO");
    }
    
}
