import java.util.Scanner;
public class SmallestMissingSubstring {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.next();
        for(char ch = 'a'; ch <= 'z' ;ch++){
            String current = String.valueOf(ch);
            if(!k.contains(current)){
                System.out.println(current);
                return;
            }
        }
        for(char ch1 = 'a';ch1<='z';ch1++){
            for(char ch2 = 'a';ch1 <= 'z';ch2++){
                String current = "" + ch1 + ch2;
                if(!k.contains(current)){
                    System.out.println(current);
                    return;
                }
            }
        }
    }
}
