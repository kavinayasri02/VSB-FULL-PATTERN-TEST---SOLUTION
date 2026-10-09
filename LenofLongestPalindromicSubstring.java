import java.util.*;
public class LenofLongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int max = 0;
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String ss = str.substring(i,j+1);
                if(palindrome(ss)){
                    if(ss.length() > max){
                        max = ss.length();
                    }
                }
            }
        }System.out.print(max);
    }
    public static boolean palindrome(String s){
        int left =0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }left++;
            right--;
        }return true;
    }
}
