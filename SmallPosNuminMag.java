import java.util.*;
public class SmallPosNuminMag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        if(k==0){
            System.out.println("0");
            return;}
            boolean isNeg = (k<0);
            long num = Math.abs(k);
            int[]dc = new int[10];
            while(num > 0){
                int dig = (int)(num %10);
                dc[dig]++;
                num/=10;
        }
        StringBuilder key = new StringBuilder();
        for(int i=1;i<=9;i++){
            if(dc[i]>0){
                key.append((i));
                dc[i]--;
                break;
            }
        }
        for(int i=0;i<=9;i++){
            while(dc[i] > 0){
                key.append(i);
                dc[i]--;
            }
        }
        if(isNeg){
            System.out.print("-");
        }System.out.println(key.toString());
    }
}
