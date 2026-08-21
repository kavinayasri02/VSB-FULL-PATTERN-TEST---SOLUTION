//using Frequency Array

import  java.util.*;
public class FirstNonRepeatingChars {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        int[]charcounts = new int[256];
        for(int i =0;i<k.length();i++){
            char Countchar = k.charAt(i);
            charcounts[Countchar]++;
        }
         char result = ' ';
         boolean found = false;
         for(int i =0;i<k.length();i++){
           char Countchar = k.charAt(i);
           if(charcounts[Countchar] == 1){
            result = Countchar;
            found = true;
            break;
           }
         }
         if(found){
            System.out.println("First non-repeating character is: " + result);
         }else{
            System.out.println("No non-repeating character found");
         }
    }
}
