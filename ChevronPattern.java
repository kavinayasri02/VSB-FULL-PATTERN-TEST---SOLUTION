import java.util.ArrayList;
import java.util.Scanner;
public class ChevronPattern {
    public static String convert(String s,int numRows){
        if(numRows == 1 || s.length()<= numRows){
            return s;
        }
        ArrayList<StringBuilder>rows = new ArrayList<>();
        for(int i =0;i<Math.min(numRows,s.length());i++){
            rows.add(new StringBuilder());
        }
        int currRow = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rows.get(currRow).append(c);
            if(currRow==0 || currRow == numRows -1){
                goingDown = !goingDown;
            }
            currRow += goingDown ?1 : -1;
        }
        StringBuilder finalArt = new StringBuilder();
        for(StringBuilder row : rows){
            finalArt.append(row);
        }
        return finalArt.toString();
    }
public static void main(String[] args) {
    Scanner kavi = new Scanner(System.in);
    String s = kavi.next();
    int numRows =  kavi.nextInt();
    System.out.println(convert(s,numRows));
    kavi.close();
}
}
