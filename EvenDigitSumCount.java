import java.util.*;
public class EvenDigtiSumCount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        for(int i=1;i<=num;i++){
            int n = i;
            int sum =0;
            while(n>0){
                sum = sum + n%10;
                n= n/10;
            }
            if(sum%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
