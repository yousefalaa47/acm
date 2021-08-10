package phase_0;

import java.util.Scanner;

public class Bebo_gamed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int Q = input.nextInt();
        String SS = input.next();
        String[][] query = new String[Q][3];

        for (int i = 0; i < Q; i++) {

            query[i][0] = input.next();

            if(query[i][0].equalsIgnoreCase("substr") || query[i][0].equalsIgnoreCase("sort") || query[i][0].equalsIgnoreCase("reverse")){
                query[i][1]=input.next();
                query[i][2]=input.next();
            }else if(query[i][0].equalsIgnoreCase("push_back") || query[i][0].equalsIgnoreCase("print")){
                query[i][1]=input.next();
            }

        }

        for (int i = 0; i < Q; i++) {
            if(query[i][0].equalsIgnoreCase("push_back")){
                SS = SS + query[i][1];
            }

            else if(query[i][0].equalsIgnoreCase("pop_back")){
                SS = SS.substring(0,SS.length()-1);
            }

            else if(query[i][0].equalsIgnoreCase("back")){
                System.out.println(SS.charAt(SS.length()-1));
            }

            else if(query[i][0].equalsIgnoreCase("front")){
                System.out.println(SS.charAt(0));
            }

            else if(query[i][0].equalsIgnoreCase("sort")){
                int x = Integer.parseInt(query[i][1]);
                int y = Integer.parseInt(query[i][2]);
                if(x<y)
                    SS = sort(SS,x-1,y);
                else
                    SS = sort(SS,y-1,x);

            }

            else if(query[i][0].equalsIgnoreCase("reverse")){
                int x = Integer.parseInt(query[i][1]);
                int y = Integer.parseInt(query[i][2]);
                if(x<y)
                    SS = reverse(SS,x-1,y);
                else
                    SS = reverse(SS,y-1,x);

            }

            else if(query[i][0].equalsIgnoreCase("substr")){
                int x = Integer.parseInt(query[i][1]);
                int y = Integer.parseInt(query[i][2]);
                if(x<y)
                    System.out.println(SS.substring(x-1,y));
                else
                    System.out.println(SS.substring(y-1,x));

            }

            else if(query[i][0].equalsIgnoreCase("print")){
                int x = Integer.parseInt(query[i][1]);
                System.out.println(SS.charAt(x-1));
            }

        }
    }
    public static String reverse(String SS,int x,int y){
        String old = SS.substring(x, y);
        String re ="";
        for (int i = old.length()-1 ; i >= 0 ; i--) {
            re += old.charAt(i);
        }
        return SS.substring(0, x) + re + SS.substring(y,SS.length());
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
}


