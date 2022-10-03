
package javaapplication57;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java .util.* ;
public class JavaApplication57 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File as = new File("E:\\test.txt");
        BufferedReader aa = new BufferedReader(new FileReader(as));
        String s;
        while((s == aa.readline()) != null){
            String [] arr = s.split(" ");
            for (int i = 0; i <= arr.length;i++) {
                String n = arr[i];
                char fchar = n.charAt(0);
                System.out.print(fchar + "");
            }
            System.out.println(" ");
        }
    
    }
}
