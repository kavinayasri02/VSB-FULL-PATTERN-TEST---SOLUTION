import java.util.Arrays;
import java.util.Scanner;
public class LargestSubsequenceSum {
    static class Element{
        int value;
        int index;
        Element(int value,int index){
            this.value = value;
            this.index = index;
        }
    }
  public static void main(String[] args) {
  Scanner kavi = new Scanner(System.in);
int n = kavi.nextInt();
int[] nums = new int[n];
for(int i =0;i<n;i++){
    nums[i] = kavi.nextInt();
}
int k = kavi.nextInt();
Element[]elements = new Element[n];
for(int i =0;i<n;i++){
  elements[i] = new Element(nums[i],i);
}
Arrays.sort(elements,(a,b)-> Integer.compare(b.value,a.value));
Element[] topK = new Element[k];
for(int i =0;i<k;i++){
    topK[i] = elements[i];
}
Arrays.sort(topK , (a,b) -> Integer.compare(a.index , b.index));
for(int i =0;i<k;i++){
    System.out.print(topK[i].value + " ");
}
kavi.close();
  }  
}
