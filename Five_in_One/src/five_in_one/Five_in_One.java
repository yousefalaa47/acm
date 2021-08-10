package five_in_one;

import java .util.* ;
public class Five_in_One {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int arr[] = new int [n] ;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int mini = arr[0] ;
        for (int i = 0; i < n; i++) {
            if (arr[i] < mini) {
                mini = arr[i] ;
            }
        }   
        int max = arr[maxmum(arr)];
        
        int prime = 0 ;
        for (int i = 0; i < n; i++) 
            prime =  isPrime(arr[i]) ?  prime+1 : prime;           
                
        int paladrome = 0 ;
        int ss = 0 ;
        for (int i = 0; i < n; i++) {
             ss = arr[i] ;
             String s = Integer.toString(ss) ;
            if (s.charAt(0) == s.charAt(s.length()-1)) {
                 paladrome++ ;
            }
        }
        int divisor;
        int arrd[] = new int [n] ;
        int bigMax = 0;
        for (int i = 0; i < n; i++){
            arrd[i] = divisor(arr[i]);
        }
        int index = maxmum(arrd);
        bigMax = arrd[index];
        
        int res = arr[index];
        
        for (int i = 0; i < n; i++) {
            if (bigMax == arrd[i]) {
                if (arr[i] > arr[index]) {
                    res = arr[i];
                }
            }
        }

        System.out.println("The maximum number : " + max);
        System.out.println("The minimum number : " + mini);
        System.out.println("The number of prime numbers : " + prime);
        System.out.println("The number of palindrome numbers : " + paladrome);
        System.out.println("The number that has the maximum number of divisors : " + res);        
    }
    public static boolean isPrime(int a){
        if (a==1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) 
                return false;            
        }
        return true;        
    }
    public static int divisor(int a){
        int x = 2;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                x++;                
            }            
        }
        return x;
    }

    public static int maxmum(int[] arr){
        int max = arr[0] ;
        int j = 0;
        for (int i=0 ; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i] ;
                j = i;
            }            
        }
        return j;
    }
}