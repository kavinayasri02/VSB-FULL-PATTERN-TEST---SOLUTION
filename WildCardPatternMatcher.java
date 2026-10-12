import java.util.*;
public class WildCardPatternMatcher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = str1.length();
        int m = str2.length();
        boolean [][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i=1;i<=n;i++){
            if(str1.charAt(i-1) =='*'){
                dp[i][0] = dp[i-1][0];
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                char patch = str1.charAt(i-1);
                char tarch = str2.charAt(j-1);
                if(patch == '?' || patch == tarch){
                    dp[i][j] = dp[i-1][j-1];
                }else if(patch == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        System.out.println("Second string:" + str2);
        if(dp[n][m]){
            System.out.println("The strings match");
        }else{
            System.out.println("The strings do not match");
        }
    }
}