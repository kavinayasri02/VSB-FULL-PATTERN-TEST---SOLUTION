import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class LockerKeyUnlocker{
public static void main(String[] args) {
    Scanner kavi = new Scanner(System.in);
   int nums = kavi.nextInt();
     while(temp>0){
     digitList.add(temp%10);
      temp/=10;
   }int[]arr = new int[digitList.size()];
   for(int i =0;i<digitList;i++){
    arr[i]=digitList.get(i);
   }Arrays.sort(arr);
   int firstNonZeroIdx = -1;
   for(int i =0;i<arr.length;i++){
    if(arr[i]!=0){
        firstNonZeroIdx = i;
        break;
    }
   }
   if(firstNonZeroIdx > 0){
    int swaptemp = arr[0];
    arr[0] = arr[firstNonZeroIdx];
    arr[firstNonZeroIdx] = swaptemp;
   }
   long unlockedKey = 0;
   for(int i = 0 ;i<arr.length;i++){
    unlockedKey = unlockedKey *10+arr[i];
   }System.out.println(unlockedKey);
}
}