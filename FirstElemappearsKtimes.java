import java.util.*;
public class FirstElemappearsKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] count = new int[101];
        for(int i=0;i<n;i++){
            int elem = arr[i];
            count[elem]++;
        }
        int ans = -1;
        for(int i=0;i<n;i++){
            int elem = arr[i];
            if(count[elem] == k){
                ans = elem;
                break;
            }
        }
        System.out.println(ans);
        sc.close(); 
    }
}
