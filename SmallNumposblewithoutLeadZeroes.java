import java.util.*;
public class SmallNumposblewithoutLeadZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean isNeg = key<0;
        String numStr = String.valueOf(Math.abs(key));
        char[] dig = numStr.toCharArray();
        Arrays.sort(dig);
        if(dig[0] == '0'){
            for(int i=1;i<dig.length;i++){
                if(dig[i]!='0'){
                    char temp = dig[0];
                    dig[0] = dig[i];
                    dig[i] = temp;
                    break;
                }
            }
        }
        int ulKey = Integer.parseInt(new String(dig));
        if(isNeg){
            ulKey = -ulKey;
        }
        System.out.println(ulKey);
        sc.close();
    }
}
