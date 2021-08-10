
package even_indices;
import java .util.* ;
public class Even_indices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n] ;
        for (int i = 0; i < n ; i++) {
            arr[i] = input.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = n -2 ; i >= 0; i = i-2) {
                System.out.print(arr[i] + " ");
            }
            
            
        }
        if (n % 2 != 0) {
                for (int i = n - 1; i >= 0; i = i-2) {
                    System.out.print(arr[i] + " ");
                }
            }
    }
    
}
