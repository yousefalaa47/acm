package reverse_words;
import java .util.* ;
public class Reverse_Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] SArr = s.split(" ");
        for (int i = 0; i <= SArr.length-2 ; i++) {            
            System.out.print(call(SArr[i])+" ");
        }        
        System.out.println(call(SArr[SArr.length-1]));         
    }
    public static String call(String a){
        String res = "";
        for (int i = a.length()-1 ; i >= 0; i--) 
            res += a.substring(i,i+1);
        
        return res;
    }    
}
