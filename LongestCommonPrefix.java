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

//Using Sorting method
import java.util.Arrays;
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Sort the array alphabetically
        Arrays.sort(strs);
        // Get the first and last strings after sorting
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        // Compare characters of the first and last strings
        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        // Return the substring that matches
        return first.substring(0, index);
    }
}
