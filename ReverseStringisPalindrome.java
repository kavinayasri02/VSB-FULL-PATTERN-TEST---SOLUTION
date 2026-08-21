//Using two pointer method

import java.util.*;
public class ReverseStringisPalindrome {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        //Enter a String to check Palindrome
        String k = kavi.nextLine();
        String str = k.toLowerCase();
        int left = 0;
        int right = str.length()-1;
        boolean isPalindrome = true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("'" + k + " is a Palindrome");
        }else{
            System.out.println("'" + k + " is not a Palindrome");
        }
    }
}

//Using StringBuilder MEthod

import java.util.*;
public class ReverseStringisPalindrome{
      public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        //Enter a String to be reversed
        String k = kavi.nextLine();
        String str = k.toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println(rev + " is a Palindrome");
        }else{
            System.out.println(rev + " is not a Palindrome");
        }
      }
}

