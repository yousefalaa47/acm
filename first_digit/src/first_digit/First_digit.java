
package first_digit;
import java .util.* ;
public class First_digit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (s.charAt(0) % 2 == 0) 
            System.out.println("EVEN");
        
        else
            System.out.println("ODD");
    }
    
}
