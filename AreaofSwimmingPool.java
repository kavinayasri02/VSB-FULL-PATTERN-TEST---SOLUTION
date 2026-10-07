import java.util.*;
public class AreaofSwimmingPool {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double len = sc.nextDouble();
        double bread = sc.nextDouble();
        double circle = 2 * 3.14*rad;
        double rect = 2*(len + bread);
        System.out.printf("%.2f\n", circle);
        System.out.printf("%.2f\n", rect);
        int sign = (int) Math.signum(circle - rect);
        String[] msg = {"Rectangular swimming pool has larger area",
         "Both pools covers the same area",
         "Circular swimming pool has the larger area"};
         System.out.println(msg[sign + 1]);
    }
}