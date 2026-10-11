import java.util.Scanner;
public class DegreewithShortSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        int[] count = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];
        java.util.Arrays.fill(first,-1);
        int deg = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            int x = arr[i];
            if(first[x] == -1){
                first[x] = i;
            }
            last[x] = i;
            count[x]++;
            if(count[x] > deg){
                deg = count[x];
            }
        }
        int min = n;
        for(int i=0;i<n;i++){
            int x = arr[i];
            if(count[x] == deg){
                int len = last[x] - first[x] + 1;
                if(len<min){
                    min = len;
                }
            }
        }
        System.out.println(min);
    }
}
