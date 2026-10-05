import java.util.*;
public class CircleIntersect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        sc.close();
        double d = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        double area = 0.0;
        if(d>= r1+r2){
            area = 0.0;
        }else if (d<=Math.abs(r1-r2)){
            double s = Math.min(r1,r2);
            area = Math.PI*Math.pow(s,2);
        }else{
            double a = 2 * Math.acos((r1*r1 + d*d-r1*r1)/2*r1*d);
            double b = 2 * Math.acos((r2*r2 + d*d-r2*r2)/2*r1*d);
            double area1 = 0.5 * r1*r1 *(a-Math.sin(a));
            double area2 = 0.5 * r2*r2 *(b-Math.sin(b));
            area = area1 + area2;
        }
        System.out.printf("%.6f\n",area);
}
}