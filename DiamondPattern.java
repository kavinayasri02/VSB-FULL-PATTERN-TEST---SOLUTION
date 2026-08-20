import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int n = kavi.nextInt();
        int mid = (n/2)+1;
        for(int i = 1 ; i<=n;i++){
            int totalnosinRow;
            int totalSpacesinRow;
            if(i<=mid){
                totalnosinRow = i;
                totalSpacesinRow = mid - i;
            }else{
                totalnosinRow = n-i+1;
                totalSpacesinRow = i - mid;
            }
            for(int j =1;j<= totalSpacesinRow;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalnosinRow;j++){
                System.out.print(j);
                if(j<totalnosinRow){
                    System.out.print("*");
                }
            }
System.out.println();
        }
        kavi.close();
        }
    }
