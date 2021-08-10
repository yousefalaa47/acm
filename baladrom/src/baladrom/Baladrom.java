package baladrom;

import java .util.* ;

public class Baladrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String s = input.next();
        int y = s.length()-1;
        boolean res = true;

        for (int i = 0; i <= s.length()/2; ) {
            if (s.charAt(i) != s.charAt(y)) {
                res = false;
                break;
            }
            else{
                i++;
                y--;
            }
        }

        if(res)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
