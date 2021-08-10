package summation;

import java .util.* ;
public class Summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long q = 0 ;
        int c = input.nextInt();
        int arr [] = new int [c] ;
        for (int i = 0; i < c; i++) {
            int a = input.nextInt();
             arr[i] = a ;
        }
        for (int i = 0; i < c; i++) {
           q = q + arr[i] ;
        }
        System.out.println(q);
        
        
    }
    
}
