
package two_n;
import java .util.* ;
public class Two_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double y = input.nextInt();
        System.out.println("floor " + (int)x +" / " + (int)y + " = " + (int)Math.floor(x/y));
        System.out.println("ceil " + (int)x + " / " + (int)y + " = " + (int)Math.ceil(x/y));
        System.out.println("round " + (int)x + " / " + (int)y + " = " + Math.round(x/y));

    }
    
}
