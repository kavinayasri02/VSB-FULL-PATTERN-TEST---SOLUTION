import java.util.*;
public class MaxSumafterRotofArr {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       int[]arr = new int[n];
       long sum =0;
       long cursum = 0;
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        sum = sum + arr[i];
        cursum = cursum + (long)i * arr[i];
       }
       long maxsum = cursum;
       for(int i=1;i<n;i++){
        long dropElem = arr[n-i];
        cursum = cursum + sum- ((long)n * dropElem);
        if(cursum > maxsum){
            maxsum = cursum;
        }
       }System.out.println(maxsum);
    }
}
