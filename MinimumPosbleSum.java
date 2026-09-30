import java.util.*;
public class MinimumPosbleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n<=4){
            int minVal = arr[0];
            for(int i = 1;i<n;i++){
                if(arr[i] < minVal){
                    minVal = arr[i];
                }
            }
            System.out.println(minVal);
            return;
        }
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[2];
        dp[3] = arr[3];
        for(int i = 4;i<n;i++){
          int minPrev = Math.min(Math.min(dp[i-1],dp[i-2]),Math.min(dp[i-3],dp[i-4]));
          dp[i] = arr[i] + minPrev;
    }
    int minSum = Math.min(Math.min(dp[n-1],dp[n-2]),Math.min(dp[n-3],dp[n-4]));
    System.out.println(minSum);
    sc.close();
}
}