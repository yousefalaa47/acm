package mirror_array;

import java .util.* ;
public class Mirror_Array {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       int n = input.nextInt();       
       int m = input.nextInt();        
       int arr[][] = new int [n][m];
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               arr[i][j] = input.nextInt();
           }
       }
        
        int s = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/2;j++) {
                s = (m-j)-1;
                int temp = arr[i][s] ;
                arr[i][s] = arr[i][j] ;
                arr[i][j] = temp ;                
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
