
package maxmum_number;
import java .util.* ;
public class Maxmum_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        long k =(int)( Math.sqrt((2 * x) + 0.25) - 0.5) ;
        System.out.println(k);
        
    }
    
}
