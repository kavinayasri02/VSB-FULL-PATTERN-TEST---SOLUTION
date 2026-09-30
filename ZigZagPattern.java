import java.util.Scanner;
public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine())return;
        String s = sc.nextLine();
        int x = sc.nextInt();
        if(x == 1 || s.length() <= x){
            System.out.println(s);
            return;
        }
        StringBuilder[] rows = new StringBuilder[x];
        for(int i=0;i<x;i++){
            rows[i] = new StringBuilder();
        }
        int cr= 0;
        boolean gd = false;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            rows[cr].append(ch);
            if(cr == 0 || cr == x-1){
                gd = !gd;
            }
            if(gd){
                cr += 1;
            }else{
                cr -= 1;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<x;i++){
            res.append(rows[i]);
        }
        System.out.println(res.toString());
    }
}
