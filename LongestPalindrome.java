import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cc = new int[128];
        for(int i=0;i<s.length();i++){
            cc[s.charAt(i)]++;
        }
            int max = 0;
            boolean hasOdd = false;
            for(int count : cc){
               max+=(count/2)*2;
               if(count%2 == 1){
                hasOdd = true;
               }
            }
            if(hasOdd){
                max+=1;
            }
           System.out.println(max);
        }
    }
