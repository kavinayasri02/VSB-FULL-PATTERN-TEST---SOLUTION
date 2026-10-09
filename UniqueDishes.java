import java.util.*;
public class UniqueDishes{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int order = -1;
        for(int i=0;i<n;i++){
            boolean isUnique = true;
            for(int j=0;j<n;j++){
                if( i!=j && arr[i]==arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                order = arr[i];
                break;
            }
        }
        System.out.print(order);
    }
}