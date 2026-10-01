import java.util.*;
public class FactorialofagivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]res = new int[500];
        res[0] = 1;
        int resS = 1;
        for(int i = 2;i<=n;i++){
            int carry =0;
            for(int j=0;j<resS;j++){
             int prod = res[j] * i + carry;
             res[j] = prod % 10;
             carry = prod/10;
            }
            while(carry > 0){
                res[resS] = carry % 10;
                carry = carry/10;
                resS++;
            }
        }
       for(int j=resS-1;j>=0;j--){
        System.out.print(res[j]);
       }
       System.out.println();
       sc.close();
    }
}
