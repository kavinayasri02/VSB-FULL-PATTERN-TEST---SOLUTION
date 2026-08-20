import java.util.Scanner;
import java.util.HashMap;
public class BinarySubarray {
    public static int numSubarraysWithSum(int [] nums,int goal){
        HashMap<Integer,Integer>map = new HashMap <>();
        map.put(0,1);
        int currentSum = 0;
        int totalSubarrays = 0;
        for(int num : nums){
            currentSum += num;
            if(map.containsKey(currentSum - goal)){
                totalSubarrays += map.get(currentSum - goal);
            }
            map.put(currentSum, map.getOrDefault(currentSum,0)+1);
        }
        return totalSubarrays;
    }
    public static void main(String[] args) {
        int [] nums = { 1,0,1,0,1};
        int goal = 2;
        int result =  numSubarraysWithSum(nums,goal);
        System.out.println(result);
    }
}
