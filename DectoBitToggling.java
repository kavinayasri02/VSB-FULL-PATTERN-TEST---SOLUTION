import java.util.*;
public class DectoBitToggling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bit = Integer.toBinaryString(n).length();
        int mask = (1<<bit) -1;
        int result = n ^ mask;
        System.out.println(result);
    }
}
