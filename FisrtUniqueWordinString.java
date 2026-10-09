import java.util.*;
public class FisrtUniqueWordinString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[]words = s.split(" ");
        boolean unique = false;
        for(int i=0;i<words.length;i++){
            int count = 0;
            for(int j=0;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }if(count == 1){
                System.out.println(words[i]);
                unique = true;
                break;
            }
        }if(!unique){
            System.out.println("-1");
        }
    }
}
