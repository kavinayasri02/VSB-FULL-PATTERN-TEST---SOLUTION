import java.util.*;
public class DivStrnReveachHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(processStr(s));
    }
    public static String processStr(String s){
        int len = s.length();
        int mid = len/2;
        StringBuilder res= new StringBuilder();
        for(int i=mid-1;i>=0;i--){
            res.append(s.charAt(i));
        }
        if(len % 2 != 0){
            res.append((s.charAt(mid)));
        for(int i=len-1;i>mid;i--){
            res.append(s.charAt(i));
        }
    }else{
        for(int i=len-1;i>=mid;i--){
            res.append(s.charAt(i));
        }
    }
    return res.toString();
}
}