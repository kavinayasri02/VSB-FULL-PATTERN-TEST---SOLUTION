import java.util.*;
public class FirstnLastOccurrenceofElem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();  
        }
        int x = sc.nextInt();
        int f = findFirstOccurrence(arr,n,x);
        if(f==-1){
            System.out.println("NO OCCURRENCES");
    }
    else{
        int l = findLastOccurrence(arr,n,x);
        System.out.println(f + " "+ l);
    }
    sc.close();
    }
    private static int findFirstOccurrence(int[]arr,int n,int x){
        int low = 0,high = n-1;
        int fIdx = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                fIdx = mid;
                high = mid-1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }return fIdx;
    }
    private static int findLastOccurrence(int[]arr,int n,int x){
        int low = 0,high = n-1;
        int LIdx = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                LIdx = mid;
                low = mid+1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }return LIdx;
}
}