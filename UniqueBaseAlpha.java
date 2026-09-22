import java.util.*;
public class UniqueBaseAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Strings :");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean[] a = new boolean[26];
        boolean[] b = new boolean[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            a[ch - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            b[ch - 'a'] = true;
        }
        boolean same = true;
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
