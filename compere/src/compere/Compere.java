
package compere;
import java .util.* ;
public class Compere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String a = input.next();
        if (s.compareTo(a) < 0) 
            System.out.println(s);
        else
         System.out.println(a);
    }
    
}
