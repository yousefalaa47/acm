package smallest_pair;

import java .util.* ;
public class Smallest_Pair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int q = 0; q < x; q++) {
                 int n = input.nextInt();
        int arr[] = new int [n];
        int arrd[] = new int [(n*(n-1))/2];
        int k =0;
                for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                    arrd[k++] = arr[i-1] + arr[j-1] + j - i;
            }
        }
        int mini = arrd[0];
        for (int i = 0; i < arrd.length; i++) {
            if (arrd[i] < mini) {
                mini = arrd[i];
            }
        } 
        System.out.println(mini);
        }

    }
    
}
