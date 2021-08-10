package xor;

import java .util.* ;
public class Xor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int q = input.nextInt();
        int xor[] = new int [q] ;
        if (q == 1) {
            System.out.println(a);
            System.exit(0);
        }
        else if(q == 2){
            System.out.println(b);
            System.exit(0);
        }
        else{
                xor[1] = a ;
                xor[2] = b ;
                xor[q] = xor[q-1]^xor[q-2] ;
                System.out.println(xor[q]);
            
            
        }
    }
    
}
