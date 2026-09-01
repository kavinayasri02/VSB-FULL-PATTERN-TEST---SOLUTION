import java.util.Scanner;
public class LongestCommonPrefix{
   public static void main(String[] args) {
       Scanner kavi = new Scanner(System.in);
       System.out.print("Enter how many words you wanted to check:");
       int n = kavi.nextInt();
       String[] words = new String[n];
       System.out.println("Enter the Words: ");
       for (int i = 0; i<n; i++) {
           words[i] = kavi.next();
       }
       System.out.print(longestCommprefix(words));
   }
   public static String longestCommprefix(String[] str){
    if(str == null || str.length == 0){
        return "";
    }
    String prefix = str[0];
    for(int i =1;i<str.length;i++){
        while(str[i].indexOf(prefix) != 0){
            prefix = prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()){
                return "";
            }
        }
    }
    return prefix;
   }
}