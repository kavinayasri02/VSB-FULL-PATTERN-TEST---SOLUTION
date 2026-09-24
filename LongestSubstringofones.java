import java.util.Scanner;
public class LongestSubstringofones{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int left =0;
        int zeros = 0;
        int maxLen = 0;
        for(int r =0;r<n;r++){
            if(s.charAt(r) == '0'){
                zeros++;
            }
            while(zeros>k){
                if(s.charAt(left) == '0'){
                    zeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,r - left + 1);
        }
        System.out.println(maxLen);
        }
    }