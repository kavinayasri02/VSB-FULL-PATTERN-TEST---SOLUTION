import java.util.Scanner;
public class StringsetCheck{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String s1 = kavi.next();
        String s2 = kavi.next();
        if(s1.contains(s2) || s2.contains(s1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        kavi.close();
        }
    }