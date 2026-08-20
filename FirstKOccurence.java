import java.util.HashMap;
import java.util.Scanner;
public class FirstKOccurence{
public static void main(String[]args){
    Scanner kavi = new Scanner(System.in);
    int n = kavi.nextInt();
    int []arr =  new int[n];
    for (int i = 0; i < arr.length; i++) {
     arr[i] = kavi.nextInt();    
    }
    int k = kavi.nextInt();
    HashMap<Integer,Integer>countMap =  new HashMap<>();
    for(int num : arr){
        countMap.put(num,countMap.getOrDefault(num,0) + 1);
    }
    int result = -1;
    for(int num : arr){
        if(countMap.get(num) == k){
            result = num;
            break;
        }
    }
    System.out.println(result);
    kavi.close();
}    
}
