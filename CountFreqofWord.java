import java.util.*;
public class CountFreqofWord {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[]arr = s.split("\\s+");
        int n = arr.length;
        boolean[]v= new boolean[n];
        for(int i=0;i<n;i++){
            if(v[i]){
                continue;
            }int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    v[j] = true;
                }
            }
            System.out.println("Frequency of " + arr[i]+ " is "+ count);
        }
    }
}
