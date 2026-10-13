import java.util.*;
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        long sum = 0;
        boolean found = false;
        for(int r =0;r<n;r++){
            sum = sum + arr[r];
            while(sum > s && l < r){
                sum = sum - arr[l];
                l++;
        }
        if(sum == s){
            System.out.println((l+1) + " " + (r+1));
            found = true;
            break;
        }
    }
    if(!found){
        System.out.println("-1");
    }
}
}