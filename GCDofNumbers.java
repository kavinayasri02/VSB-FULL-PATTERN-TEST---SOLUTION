import java.util.*;
public class GCDofNumbers{
    static int findGCDofTwo(int a , int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }return a;
    }public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        int k = kavi.nextInt();
        int[]arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i]=kavi.nextInt();
        }int result = arr[0];
        for(int i = 1;i<k;i++){
            result = findGCDofTwo(result, arr[i]);
        }
        System.out.println(result);
    }
}