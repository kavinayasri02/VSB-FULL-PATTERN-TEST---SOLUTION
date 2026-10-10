import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int og =n;
        int sum = 0;
        if(n==0){
            sum = 1;
        }else{
            while(n>0){
                int digit = n%10;
                sum = sum + factorial(digit);
                n = n/10;
            }
        }
        if(sum==og){
            System.out.println(og + " Strong number");
        }else{
            System.out.println(og + " not Strong number");
        }
    }
    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
}