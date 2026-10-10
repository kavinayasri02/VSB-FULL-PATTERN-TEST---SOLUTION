import java.util.Scanner;
public class SharingEqualChocos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m%n==0){
            System.out.print("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();;
    }
}
