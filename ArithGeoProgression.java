import java.util.*;
public class ArithGeoProgression {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int last = arr[n-1];
        int next =0;
        if((b-a)==(c-b)){
            int diff = b-a;
            next = last + diff;
        }else{
            int comRatio = b/a;
            next = last * comRatio;
        }System.out.println(next);
    }
}
