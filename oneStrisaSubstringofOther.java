import java.util.Scanner;
public class oneStrisaSubstringofOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Strings :");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.contains(s2) || s2.contains(s1)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
