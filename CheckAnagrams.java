import java.util.*;
public class CheckAnagrams{
    public static void main(String[]args){
        Scanner kavi  = new Scanner(System.in);
        String k = kavi.nextLine();
        String s = kavi.nextLine();
        k = k.replaceAll("\\s","").toLowerCase();
        s = s.replaceAll("\\s","").toLowerCase();
        boolean isAnagram = true;
        if(k.length() != s.length()){
            isAnagram = false;
        }else{
            char[] arr1 = k.toCharArray();
            char[] arr2 = s.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            isAnagram = Arrays.equals(arr1,arr2);
        }
        if(isAnagram){
            System.out.println("The Strings are anagrams");
        }else{
            System.out.println("THe String are not anagrams");
        }
    }
}
