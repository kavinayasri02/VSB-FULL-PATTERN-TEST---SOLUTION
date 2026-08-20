import java.util.Scanner;
public class MinimumSubSequence {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int n = kavi.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
         arr[i] = kavi.nextInt();
        }
        //size <= 4 ah iruntha
        if(n<=4){
            //min single element find pannanum
            int minVal = arr[0];
            for (int i = 0;i < n;i++) {
               if(arr[i] < minVal){
                minVal = arr[i];
               }
                }
                System.out.println(minVal);
                kavi.close();
                return;
        }
        // DP array to store min sum upto idx i
        int[]dp = new int[n];
        // first 4 elements ah direct ah pick panniralam
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[2];
        dp[3] = arr[3];
        // dp table la remaining elements pick panraku
        for(int i =4;i<n;i++){
            int minPrev = Math.min(Math.min(dp[i-1],dp[i-2],Math min dp[i-3],dp[i-4]));
            dp[i] = arr[i] + minPrev;
        }
        int minSum = Math.min(Math.min(dp[n-1],dp[n-2] ,Math.min(dp[n-3],dp[n-4])));
        System.out.println(minSum);
        kavi.close();
    }
}
