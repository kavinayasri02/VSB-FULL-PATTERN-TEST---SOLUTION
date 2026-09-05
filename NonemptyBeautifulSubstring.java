import java.util.Scanner;
public class NonemptyBeautifulSubstring {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        int L = k.length();
        int totalSS = 0;
        for(int i =0;i<L;i++){
        int aCount =0;
        int bCount = 0;
        int cCount =0;
            for(int j = i;j<L;j++){
               char ch = k.charAt(j);
               if( ch == 'a'){
                aCount++;
               }else if(ch == 'b'){
                bCount++;
               }else if(ch == 'c'){
                cCount++;
               }
               if(aCount == bCount && bCount == cCount){
                totalSS++;
               }
            }
        }
        System.out.println(totalSS);
    }
}
