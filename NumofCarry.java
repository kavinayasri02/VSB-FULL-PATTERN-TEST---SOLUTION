import java.util.Scanner;
public class NumofCarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(numofcarries(n1,n2));
    }
    public static int numofcarries(int n1,int n2){
        int  count =0;
        int carry =0;
        while(n1>0 || n2>0){
            int dig1 = n1%10;
            int dig2 = n2%10;
            int sum = dig1 + dig2 + carry;
            if(sum > 9){
                count++;
                carry = 1;
            }else{
                carry = 0;
            }
            n1 = n1/10;
            n2 = n2/10;
        }
        return count;
    }
}
