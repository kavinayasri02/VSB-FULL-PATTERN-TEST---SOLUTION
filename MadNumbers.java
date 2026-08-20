import java.util.Scanner;
public class MadNumbers {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        int num = kavi.nextInt();
        //sum of digits calc panraku use panrom
        int temp =0;
        int digitSum = 0;
        while(temp>0){
            digitSum += temp%10;      //last digit get pana
            temp/=10;                 // last digit remove pana
        }
        // patter logic apply pannanum
        int madCount = 0;
        if(digitSum%2 == 0){
            madCount = num/2;
        }else{
            madCount = (num-1)/2;
        }
        //result print panraku
        System.out.println(madCount);
        kavi.close();
    }
}
