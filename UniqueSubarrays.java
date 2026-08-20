import java.util.HashMap;
import java.util.Scanner;
public class UniqueSubarrays {
    public static boolean checkUnique(int[] arr, int[]prev, int[]next,int left,int right){
        if(left >= right){
            return true;
        }
        int l = left;
        int r = right;
        int pivot = -1;
        while(l<=r){
            if(prev[l]<left && next[l]>right){
                pivot = l;
                break;
            }
            if(prev[r]>left && next[r]>right){
                pivot = r;
                break;
            }
            l++;
            r--;
        }
        if(pivot == -1){
            return false;
        }
        return checkUnique(arr, prev, next, left, pivot -1) && checkUnique(arr, prev, next, pivot+1,right);
            }
            public static void main(String[] args) {
                Scanner kavi = new Scanner(System.in);
                int n = kavi.nextInt();
                int[]arr = new int[n];
                for(int i =0;i<n;i++){
                  arr[i] = kavi.nextInt();
                }
                int[] prev =  new int[n];
                int[]next = new int[n];
                HashMap<Integer,Integer>lastSeen = new HashMap<>();
                for(int i =0;i<n;i++){
                    prev[i] =  lastSeen.getOrDefault(arr[i], -1);
                    lastSeen.put(arr[i],i);
                }
                lastSeen.clear();
                for(int i = n-1;i>=0;i--){
                    next[i] = lastSeen.getOrDefault(arr[i], n);
                    lastSeen.put(arr[i],n);
                }
                if(checkUnique(arr, prev, next, 0, n-1)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                kavi.close();
            }
    }
