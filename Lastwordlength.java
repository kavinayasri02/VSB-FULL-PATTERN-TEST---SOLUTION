import java.util.Scanner;
public class Lastwordlength {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        //1. entire input string ah read panraku
        String s = kavi.nextLine();
        //2.  spaces ellathayum remove panraku
        s = s.trim();
        int LastSpaceIndex = s.lastIndexOf(' ');
        //3.last word ah extract panraku
        int startOfLastWord = (LastSpaceIndex == -1)?0: LastSpaceIndex + 1;
        String lastWord = s.substring(startOfLastWord);
        //4.length ah uhm word uhm separate lines la print panraku
        System.out.println(lastWord.length());
        System.out.println(lastWord);
        kavi.close();
    }
}
