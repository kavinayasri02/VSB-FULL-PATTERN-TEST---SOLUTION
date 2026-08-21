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

// Using Two pointer method

import java.util.*;
public class ReverseString{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        //Enter a String to be reversed
        String k = kavi.nextLine();
        char[]ch = k.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String rev = new String(ch);
        System.out.println("Reversed String : " + rev);
    }
}
