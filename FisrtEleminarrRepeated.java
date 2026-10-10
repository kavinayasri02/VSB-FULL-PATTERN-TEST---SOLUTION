import java.util.Scanner;
public class FisrtEleminarrRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println("The first repating element is " + arr[i]);
                    return;
                }
            }        
        }
        System.out.println("There are no repeating elements");
        sc.close();
    }
}
