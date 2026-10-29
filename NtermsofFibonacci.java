import java.util.Scanner;
public class NtermsofFibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            return;
        }
        long f = 0;
        long s = 1;
        System.out.print(f);
        for(int i=1;i<n;i++){
            System.out.print(" " + s);
            long next = f + s;
            f = s;
            s = next;
        }
        System.out.println();
    }
}