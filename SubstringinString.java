
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SubstringinString {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l1 = br.readLine();
        if(l1 == null || l1.trim().isEmpty()) return;
        String[] p = l1.trim().split("\\s+");
        int q = Integer.parseInt(p[0]);
        char c = p[1].charAt(0);
        String s = br.readLine();
        if(s==null)return;
        int[]count = new int[s.length() + 1];
        count[0] = 1;
        int curr = 0;
        long tss = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                curr++;
            }
            if(curr>=q){
                tss += count[curr - q];
            }
            count[curr]++;
        }
        System.out.println(tss);
    }
}
