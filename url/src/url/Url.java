
package url;
import java .util.* ;
public class Url {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int a = 0 ;
        for (int i = 0; i < s.indexOf('&'); i++) {
            if (s.charAt(i) == '=') {
                System.out.println("username: " + s.substring(i+1, s.indexOf('&', i)));
                a = s.indexOf('&') ;
            }
        }
         for (int i = a; i <= s.indexOf('&' , a+1); i++) {
            if (s.charAt(i) == '=') {
                System.out.println("pwd: " + s.substring(i+1, s.indexOf('&', i))); 
                a = s.indexOf('&' ,  i) ;
                break;
            }    
        }
         for (int i = a; i <= s.indexOf('&' , a+1); i++) {
            if (s.charAt(i) == '=') {
                System.out.println("profile: " + s.substring(i+1, s.indexOf('&', i))); 
                a = s.indexOf('&' ,  i) ;
                break;
            }    
        }
         for (int i = a; i <= s.indexOf('&' , a+1); i++) {
            if (s.charAt(i) == '=') {
                System.out.println("role: " + s.substring(i+1, s.indexOf('&', i))); 
                a = s.indexOf('&' ,  i) ;
                break;
            }    
        }
         for (int i = a; i <= s.length()-1; i++) {
            if (s.charAt(i) == '=') {
                System.out.println("key: " + s.substring(i+1, s.length())); 
                a = s.indexOf('&' ,  i) ;
                break;
            }    
        }
         

    }
    
}
