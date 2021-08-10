
package distance_points;
import java .util.* ;
public class Distance_points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = input.nextLong();
        System.out.println(Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d))));
    }
    
}
