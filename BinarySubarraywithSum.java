import java.util.*;
public class BinarySubarraywithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int goal = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum = sum + nums[j];
                if(sum==goal){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
