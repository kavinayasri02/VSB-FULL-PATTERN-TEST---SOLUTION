import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class WordBreakII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        HashSet<String>word = new HashSet<>();
        for(int i=0;i<n;i++){
            word.add(sc.next());
        }
        List<String>res = new ArrayList<>();
        backtrack(s,0,word,new ArrayList<>(),res);
        System.out.println(res);
    }
    private static void backtrack(String s, int start,HashSet<String>word,List<String>currWord,List<String>res){
        if(start == s.length()){
            res.add(String.join(" ",currWord));
            return;
        }
        for(int end = start + 1;end <= s.length();end++){
            String sub = s.substring(start,end);
            if(word.contains(sub)){
                currWord.add(sub);
                backtrack(s, end, word, currWord, res);
                currWord.remove(currWord.size()-1);
            }
        }
    }
}
