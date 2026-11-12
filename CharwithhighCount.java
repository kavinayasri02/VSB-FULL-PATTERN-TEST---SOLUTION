import java.util.Scanner;
public class CharwithhighCount{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[]arr = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch]++;
        }
        int max = 0;
        char bc = '\0';
        for(int i=0;i<256;i++){
            if(arr[i]>max){
                max = arr[i];
                bc = (char)i;
            }
        }
        System.out.println(bc+ " " + max);
    }
}