import java.util.Scanner;
public class ClimbStairs {
    public static int climbWays(int n ){
        if(n==1) return 1;
        if(n==2) return 2;
        //variables to keep track of prev 2 steps
        int prev1 = 0;
        int prev2 = 1;
        int current = 0;
        for(int i =3;i<=n;i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        if(kavi.hasNextInt()){
            int n = kavi.nextInt();
            System.out.println(climbWays(n));
        }
        kavi.close();
    }
}
