import java.util.*;
public class LongestSubstrwithoutrepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine()){ return; }
        String s = sc.nextLine();
        int n = s.length();
        int ml = 0;
        int[] ls = new int[128];
        for(int i=0;i<128;i++){
            ls[i] = -1;
        }int left = 0;
        for(int r =0;r<n;r++){
            char cc = s.charAt(r);
            if(ls[cc] >= left){
                left = ls[cc] + 1;
            }ls[cc] = r;
            ml = Math.max(ml,r-left + 1);
        }
        System.out.print(ml);
        sc.close();
    }
}
