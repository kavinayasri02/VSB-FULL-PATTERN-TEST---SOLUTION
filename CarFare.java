import java.util.*;
public class CarFare{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long d = sc.nextLong();
        long oc = sc.nextLong();
        long of = sc.nextLong();
        long od = sc.nextLong();
        long cs = sc.nextLong();
        long cb = sc.nextLong();
        long cm = sc.nextLong();
        long cd = sc.nextLong();
        long o_cost;
        if(d<=of){
            o_cost = oc;
        }else{
            o_cost = oc + (d-of)*od;
        }
        double time = (double)d/cs;
        double c_cost = cb + (time*cm)+(d*cd);
        if((double)o_cost <= c_cost){
            System.out.print("Online Taxi");
        }else{
             System.out.print("Classic Taxi");
        }
    }
}