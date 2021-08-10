
package swap_matrix;
import java .util.* ;
public class Swap_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[][] = new int [n][n];
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
           int t = arr[x-1][i] ;
           arr[x-1][i] = arr[y-1][i];
           arr[y-1][i] = t ;
        }
        for (int i = 0; i < n; i++) {
           int z = arr[i][x-1] ;
           arr[i][x-1] = arr[i][y-1];
           arr[i][y-1] = z ;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
