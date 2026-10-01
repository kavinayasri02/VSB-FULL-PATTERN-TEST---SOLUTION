import java.util.*;
public class SubarrayatleastoneuniqueElem{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[]arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        System.out.print(arr[i] + (i == n-1 ? "" : " "));
      }
      System.out.println();
      boolean u = true;
      for(int i=0;i<n;i++){
        for(int j =i;j<n;j++){
          boolean hasu = false;
          for(int k = i;k<=j;k++){
            int count =0;
            for(int m = i;m<=j;m++){
              if(arr[m] == arr[k]){
                count++;
              }
            }
            if(count == 1){
              hasu = true;
              break;
            }
          }
          if(!hasu){
            u = false;
            break;
          }
        }
        if(!u){
          break;
        }
      }
      if(u){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }sc.close();
  }
}