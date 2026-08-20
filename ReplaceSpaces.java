import java.util.Scanner;
public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        // entire line ah read pnaraku
        if(kavi.hasNextLine()){
            String s = kavi.nextLine();
            // + vanthu 1 or neraya space oda match achuna 
            //andha entire match aana space ah single space ah replace panrom
            String result = s.replaceAll(" +", " ");
            // over spcae remove pana string ah print panraku
            System.out.println(result);
        }
        kavi.close();
    }
}
