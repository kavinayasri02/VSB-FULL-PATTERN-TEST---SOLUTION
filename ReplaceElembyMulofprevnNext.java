import java.util.*;
public class ReplaceElembyMulofprevnNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n==1){
            System.out.print(arr[0]);
            return;
        }
        int[] result = new int[n];
        result[0] = arr[0] * arr[1];
        for(int i=1;i<n-1;i++){
            result[i] = arr[i-1] * arr[i+1];
        }
        result[n-1] = arr[n-2]* arr[n-1];
        for(int i=0;i<n;i++){
            System.out.print(result[i] + (i == n-1 ? "" : " "));
        }
    }
}
