package long_word;

import java .util.* ;

public class Long_word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            String s = input.next();
            if(s.length()<10) 
                System.out.println(s);
            else 
                System.out.println(s.charAt(0) +""+ (s.length()-2) +""+ s.charAt(s.length()-1));
        }
    }   
}
