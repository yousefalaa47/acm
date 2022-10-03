package gravity_flip;

import java .util.* ;
public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr[] = new int [a]; 
        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
