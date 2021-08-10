package string_functions;

import java .util.* ;
public class String_Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        String s = input.next();
        
        for (int i = 1; i <= y; i++) {
            String r = input.next();
            if (r.compareTo("substr") == 0) {
                System.out.println(s.substring(input.nextInt()-1, input.nextInt()));
            }
            if (r.compareTo("pop_back") == 0) {
                s = s.substring(0, s.length()-1);
            }
            if (r.compareTo("back") == 0) {
                System.out.println(s.charAt(s.length()-1));
            }
            if (r.compareTo("front") == 0) {
                System.out.println(s.charAt(0));
            }
            if (r.compareTo("print") == 0) {
                int q = input.nextInt();
                System.out.println(s.charAt(q-1));
            }
            if (r.compareTo("push_back") == 0) {
                String d = input.next();
                s = s + d;
            }
            if (r.compareTo("reverse") == 0) {
                int a = input.nextInt();
                int b = input.nextInt();
                s = s.substring(0, a-1) + reverse(s.substring(a-1,b),a-1,b) + s.substring(b, s.length());
            }
            if (r.compareTo("sort") == 0) {
                int a = input.nextInt();
                int b = input.nextInt();
                s = s.substring(0, a-1) + sort(s.substring(a-1,b),a-1,b) + s.substring(b, s.length());
            }            
        }
    }

        public static String sort(String SS,int x,int y){
        String old = SS.substring(x, y);
        char temp;
        char[] so = old.toCharArray();

        for (int i = 0; i < so.length; i++) {
            for (int j = i+1; j < so.length; j++) {
                if(so[i]>so[j]){
                    temp  = so[i];
                    so[i] = so[j];
                    so[j] = temp;
                }
            }
        }
        String SO ="";
        for (int i = 0; i < so.length; i++) {
            SO += so[i];
        }
        return SS.substring(0, x) + SO + SS.substring(y,SS.length());
    }
   public static String reverse(String SS,int x,int y){
        String old = SS.substring(x, y);
        String re ="";
        for (int i = old.length()-1 ; i >= 0 ; i--) {
            re += old.charAt(i);
        }
        return SS.substring(0, x) + re + SS.substring(y,SS.length());
    }
}
