import java.util.*;
public class ReplaceMulSpacewithOneSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String neew = s.replaceAll(" {2,}", " ");
        System.out.println(neew);
    }
}
