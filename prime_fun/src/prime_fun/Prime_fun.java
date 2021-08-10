
package prime_fun;
import java .util.* ;
public class Prime_fun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            int a = input.nextInt();
            int res = 0 ;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    res = 1 ;
                }
            }
            if (a== 1 ||res == 1 ) {
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }
   }
}
