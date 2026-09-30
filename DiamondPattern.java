import java.util.*;
public class DiamondPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2 + 1;
        for(int i=1;i<=mid;i++){
            for(int j=1;j<=mid-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j>1){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = mid-1;i>=1;i--){
            for(int j =1;j<=mid-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j>1){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}