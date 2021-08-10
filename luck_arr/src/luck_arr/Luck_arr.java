
package luck_arr;
import java .util.* ;
public class Luck_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
             arr[i] = input.nextInt();
            
        }
        int mini = arr[0] ;
        for (int i = 0; i < n; i++) {
            if (arr[i] < mini) {
                mini = arr[i] ;
            }
            
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mini) {
                r++ ;
            }
        }
        if (r % 2 != 0) {
            System.out.println("Lucky");
        }
        else{
            System.out.println("Unlucky");
        }
    }
    
}
