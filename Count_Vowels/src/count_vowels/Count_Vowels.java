
package count_vowels;
import java .util.* ;
public class Count_Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0 ;
        String s = input.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ) {
                x++;
            }
            if (s.charAt(i) == 'i' ) {
                x++;
            }
            if (s.charAt(i) == 'o' ) {
                x++;
            }
            if (s.charAt(i) == 'u' ) {
                x++;
            }
            if (s.charAt(i) == 'e' ) {
                x++;
            }
            if (s.charAt(i) == 'A' ) {
                x++;
            }
            if (s.charAt(i) == 'I' ) {
                x++;
            }
            if (s.charAt(i) == 'O' ) {
                x++;
            }
            if (s.charAt(i) == 'U' ) {
                x++;
            }
            if (s.charAt(i) == 'E' ) {
                x++;
            }
        }
        System.out.println(x);
    }
    
}
