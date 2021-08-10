package good_or_bad;

import java .util.* ;
public class Good_or_Bad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String arr[] = new String[x];
        
        for (int i = 0; i < x; i++){ 
             arr[i] = input.next();
             
             if (GorB(arr[i])) 
                 System.out.println("Good");            
             else
                 System.out.println("Bad");
        }       
    }
    public static boolean GorB (String a){
        for (int i = 0; i < a.length()-2; i++) {
            if (a.substring(i, i+3).equals("010") || a.substring(i, i+3).equals("101")) {
                return true;
            }    
        }
        return false;
    } 
}
