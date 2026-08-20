import java.util.HashSet;
import java.util.Scanner;
public class BaseAlphabet {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        // rendu string get panrom separate line ah get panraku
        String s1 = kavi.nextLine();
        String s2 = kavi.nextLine();
        //1. Create hashset to store unique characters
        HashSet<Character>set1 = new HashSet<>();
        HashSet<Character>set2 = new HashSet<>();
        //2. string 1 la irukkara ella characters ah uhm set1 la vangraku
        for(int i =0;i<s1.length();i++){
            set1.add(s1.charAt(i));
        }
        //3.string 2 la irukkara ella char ah uhm set2 la vangaraku
        for(int i = 0;i<s2.length();i++){
            set2.add(s2.charAt(i));
        }
//4.compare both the sets and print the output
if(set1.equals(set2)){
    System.out.println("True");
}else{
    System.out.println("False");
}
    }
}

