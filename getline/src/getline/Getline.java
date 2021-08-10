
package getline;
import java .util.* ;
public class Getline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\\') {
                System.out.println(s.substring(0, i));
                break ;
            }
        }
    }
    
}
