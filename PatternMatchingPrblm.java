import java.util.*;
public class PatternMatchingPrblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pat = sc.nextLine();
        search(txt,pat);
    }
    public static void search(String txt,String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!= pat.charAt(j)){
                    break;
                }
            }if(j==m){
                System.out.print("Pattern found at Index "+ i);
            }
        }
    }
}
