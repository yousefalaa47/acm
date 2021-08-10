package smallest_pair;

import java .util.* ;
public class Smallest_Pair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = input.nextInt();
        int arr[] = new int [n];
        int arrd[] = new int [n+n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n-1; i++) {
                for (int k = 0; k < n+n; k++) {
                    arrd[k] = arr[i-1] + arr[j] + j - i;
                }
                
            }
        }
        int mini = arrd[0];
        for (int i = 0; i < n; i++) {
            if (arrd[i] < mini) {
                mini = arrd[i];
            }
        } 
        System.out.println(mini);
    }
    
}
