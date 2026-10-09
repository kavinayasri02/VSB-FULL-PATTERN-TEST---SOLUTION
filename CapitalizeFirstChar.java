import java.util.*;
public class CapitalizeFirstChar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        boolean uppercase = true;
        for(int i=0;i<s.length();i++){
          char cur = s.charAt(i);
          if(cur == ' '){
            uppercase = true;
            result.append(cur);
          }else{
            if(uppercase){
                result.append(Character.toUpperCase(cur));
                uppercase = false;
            }else{
                result.append(cur);
            }
          }
        }System.out.print(result.toString());
    }
}
