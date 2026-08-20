import java.util.Scanner;
public class CircleIntersection {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        //circle 1 input
        double x1 = kavi.nextDouble();
        double y1 = kavi.nextDouble();
        double r1 = kavi.nextDouble();
        //circle 2 input
        double x2 = kavi.nextDouble();
        double y2 = kavi.nextDouble();
        double r2 = kavi.nextDouble();
        System.out.printf("%.6f\n",intersectionArea(x1,y1,r1,x2,y2,r2));
        kavi.close();
    }
    public static double intersectionArea(double x1,double y1,double r1,double x2,double y2,double r2){
        double d = Math.sqrt((x2 - x1) * (x2-x1) + (y2-y1)* (y2-y1));
        if(d>=r1+r2){
            return 0.0;
        }
        if(d<= Math.abs(r1-r2)){
            double minR = Math.min(r1,r2);
            return Math.PI* minR*minR;
        }
        double alpha = Math.acos((d*d + r1*r1 - r2*r2)/(2*d*r1));
        double beta = Math.acos((d*d + r2*r2 - r1*r1)/(2*d*r2));
        //area of sec1 +sec2 - area of triangle
        double area1 = r1 * r1 * alpha - r1 * r1 * Math.sin(2 * alpha)/2;
        double area2 = r2 * r2 * beta - r2 * r2 * Math.sin(2 * beta)/2;
        return area1 + area2;
    }
}
