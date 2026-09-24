import java.util.*;
public class MaxSubseqofLenK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int[]sorted = arr.clone();
        Arrays.sort(sorted);
        int kthLargest = sorted[n-k];
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] >= kthLargest && count < k){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
    }
}
