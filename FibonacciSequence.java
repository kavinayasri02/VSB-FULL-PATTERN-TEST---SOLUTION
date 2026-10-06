import java.util.*;
public class FibonacciSequence{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n){
        if(n<=0)return 0;
        if(n==1)return 1;
        if(n==2)return 2;
        int first = 1;
        int second = 2;
        int current = 0;
        for(int i=3;i<=n;i++){
            current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
}