
package easy_fibonacci;
import java .util.* ;
public class Easy_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fib[] = new int [n] ;
        if (n ==1) {
            System.out.println(0);
            System.exit(0);
        }
        for (int i = 0; i < n; i++) {
            fib[0] = 0 ;
            fib[1] = 1 ;
            if (i <=1 ) {
                System.out.print(i + " ");
            }
            else{
            fib[i] = fib[i-1] + fib[i-2] ;
            System.out.print(fib[i] + " ");
            }
        }
    }
    
}
