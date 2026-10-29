import java.util.Scanner;
public class SpyNumber {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = 0;
     int prod = 1;
     int temp = n;
     while(temp>0){
         int dig = temp%10;
         sum+=dig;
         prod*=dig;
         temp/=10;
     }
     if(sum == prod){
        System.out.println("Spy Number");
     }else{
        System.out.println("Not a Spy Number");
     }
    }
}
