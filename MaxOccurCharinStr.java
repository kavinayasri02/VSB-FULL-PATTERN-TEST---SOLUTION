import java.util.*;

public class MaxOccurCharinStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String s = sc.nextLine();
        int maxF = 0;
        char maxC = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }
            if (count > maxF) {
                maxF = count;
                maxC = ch;
            }
        }
        System.out.println("Highest frequency character :" + maxC);
        System.out.println("Number of times :" + maxF);
    }
}