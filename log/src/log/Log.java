
package log;
import java .util.* ;
public class Log {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       long s = input.nextLong();
        System.out.println((int)(Math.log(s)/Math.log(2)));
    }
    
}
