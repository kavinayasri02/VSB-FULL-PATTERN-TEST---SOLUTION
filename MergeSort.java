import java.util.*;
public class MergeSort{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i]=kavi.nextInt();
        }Arrays.sort(arr);
        for(int i =k-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}