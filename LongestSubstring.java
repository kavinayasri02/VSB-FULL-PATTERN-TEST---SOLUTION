import java.util.HashSet;
import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int size = kavi.nextInt();
        int k = kavi.nextInt();
        String sk = kavi.next();
        //1. max length of 1 ah kandupudikka after changing 0
        int maxLength = 0;
        int left = 0;
        int zeroCount = 0;
for( int right = 0; right<size;right++){
    if(sk.charAt(right) == '0'){
      zeroCount++;
    }
    while(zeroCount > k){
        if(sk.charAt(left) =='0'){
            zeroCount--;
        }
        left++;
    }
    maxLength = Math.max(maxLength,right - left +1);
}
//2. ethana unique strings maxlength kudukkum nu check pana
// hashset use pani duyplicate kandu pudikka
    HashSet<String> uniqueStrings = new HashSet<>();
    left = 0;
    zeroCount= 0;
    for(int right = 0;right<size;right++){
    if(sk.charAt(right) == '0'){
        zeroCount++;
    }
    while(zeroCount > k){
        if(sk.charAt(left) =='0'){
            zeroCount--;
        }
        left++;
    }
    //3. window length vanthu maxlength oda okay aanadhu founded nah
    if(right - left +1 == maxLength){
        char[]chars = sk.toCharArray();
        for(int i =left;i<= right;i++){
            chars[i] = '1';
        }
        uniqueStrings.add(new String(chars));
    }
    }
    System.out.println(uniqueStrings.size());
    kavi.close();
    }
}
