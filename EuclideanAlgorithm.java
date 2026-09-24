import java.util.Scanner;
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gcd = sc.nextInt();
        for(int i=1;i<n;i++){
            int num = sc.nextInt();
            while(num != 0){
                int temp = num;
                num = gcd % num;
                gcd = temp;
            }
        }
        System.out.print(gcd);
    }
}
