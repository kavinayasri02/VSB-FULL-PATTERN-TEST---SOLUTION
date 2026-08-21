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

//Using Frequency Counter Method

import java.util.*;
public class CheckAnagrams{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k  = kavi.nextLine().replaceAll("\\s","").toLowerCase();
        String s = kavi.nextLine().replaceAll("\\s","").toLowerCase();
        boolean isAnagram = true;
        if(k.length() != s.length()){
            isAnagram = false;
        }else{
            int[]freq = new int[26];
            for(int i =0;i<k.length();i++){
                freq[k.charAt(i) - 'a']++;
                freq[s.charAt(i) - 'a']--;
            }
            for(int count : freq){
                if(count != 0){
                    isAnagram = false;
                    break;
                }
            }
        }
            if(isAnagram){
                System.out.println("The String are anagrams");
        }else{
            System.out.println("The Strings are not anagrams");
        }
    }
}
