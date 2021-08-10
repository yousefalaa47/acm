
package search_matrix;
import java .util.* ;
public class Search_matrix {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int res = 0 ;
       int n = input.nextInt();
       int m = input.nextInt();
       int a [][] = new int[n][m] ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {     
                if (a[i][j] == x) 
                    res = 1 ;
                
            }
        }
        if (res == 0) 
            System.out.println("will take number");
        else
            System.out.println("will not take number");
    }
    
}
