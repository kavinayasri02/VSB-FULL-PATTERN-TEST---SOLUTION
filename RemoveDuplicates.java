import java.util.*;
public class RemoveDuplicates{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(removedup(s));
    }
    public static String removedup(String str){
        StringBuilder result = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char cur = str.charAt(i);
            boolean isDup = false;
            for(int j=0;j<i;j++){
                if(str.charAt(j) == cur){
                    isDup = true;
                    break;
                }
            }if(!isDup){
                result.append(cur);
            }
        }return result.toString();
    }
}