package phase0;

import java.util.Scanner;

public class Phase0 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int i = x-1;
        boolean res = true;
//        
//        while(i>1){
//            if(x%i--==0){
//                res = false;
//                break;
//            }
//        }
        if(gen(x,x-1))
            System.out.println("YES");
        else
            System.out.println("NO");
            
    }
    public static boolean gen(int x,int i){
    
    if(i == 1){
        return true;
    }
    
    return (x%i--==0)? false:gen(x,i);
    }
}
