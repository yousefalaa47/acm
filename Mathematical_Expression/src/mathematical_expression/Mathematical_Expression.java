
package mathematical_expression;
import java .util.* ;
public class Mathematical_Expression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String s = input.next();
        int y = input.nextInt();
        String a = input.next();
        int c = input.nextInt();
        if (s.equals("+") == true && (x + y) == c) {
            System.out.println("Yes");
            System.exit(0);
        }
        else if (s.equals("+") == true && (x + y) != c){
            System.out.println(x + y);
            System.exit(0);
        }
        else if (s.equals("-") == true && (x - y) == c){ 
            System.out.println("Yes");
            System.exit(0);
        }    
        else if(s.equals("-") == true && (x - y) != c){
            System.out.println(x - y);
            System.exit(0);
        }    
        else if (s.equals("*") == true && (x * y) == c){ 
            System.out.println("Yes");
            System.exit(0);
        }    
        else{
            System.out.println(x * y);
            System.exit(0);
        }    
    }
    
}
