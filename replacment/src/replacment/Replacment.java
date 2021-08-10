
package replacment;
import java .util.* ;
public class Replacment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n] ;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
        
        
            if (arr[i] < 0) {
                arr[i] = 2 ;
                
            }
            else if(arr[i] > 0){
                arr[i] = 1 ;
            }
            else {
                arr[i] = 0 ;
            }
        }
            for (int j = 0; j < n; j++) {
                
                System.out.print(arr[j] + " ");
                
            }
            
        
      
    }
    
}
