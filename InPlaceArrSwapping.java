import java.util.Arrays;
import java.util.Scanner;
public class InPlaceArrSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().trim().split("\\s+");
        int n = nums.length;
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
        String[] pos = sc.nextLine().trim().split("\\s+");
        int[] post = new int[n];
        for(int i=0;i<n;i++){
            post[i] = Integer.parseInt(pos[i]);
        }
        int[]res = new int[n];
        for (int i = 0; i < n; i++) {
            res[post[i]] = arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
    }
