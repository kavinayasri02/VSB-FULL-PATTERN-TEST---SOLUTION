import java.util.*;
public class PrimenumFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(getCount(l,r,p));
        sc.close();
    }
    public static int countFactors(int n,int p){
        int count = 0;
        while(n%p == 0){
            count++;
            n = n/p;
        }
        return count;
    }
    public static int getCount(int l,int r,int p){
        int total = 0;
        for(int i=l;i<=r;i++){
            total+=countFactors(i, p);
        }
        return total;
    }
}
