
package pow_of_tow;
import java .util.* ;
public class Pow_of_tow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        double k = Math.log(x) / Math.log(2) ;
        if (k % 1 == 0) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
