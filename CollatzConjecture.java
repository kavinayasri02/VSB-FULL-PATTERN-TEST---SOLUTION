import java.util.Scanner;
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int s = 0;
        while(n>1){
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*n+1;
            }s++;
        }System.out.println("Steps: " + s);
    }
}
