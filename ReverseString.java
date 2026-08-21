import java.util.*;
public class ReverseString {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        //Enter a string that has to reversed
        String k = kavi.nextLine();
        String rev = "";
        for(int i =k.length()-1;i>=0;i--){
            rev += k.charAt(i);
        }
        System.out.print("Reversed String : " + rev);
    }
}
