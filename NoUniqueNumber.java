import java.util.Scanner;
public class NoUniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count =0;
        for(int i=n1;i<=n2;i++){
            if(noDigRepeat(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean noDigRepeat(int num) {
        boolean[] vis = new boolean[10];
        while(num>0){
            int digit = num%10;
            if(vis[digit]){
                return false;
            }
            vis[digit]=true;
            num = num/10;
        }
        return true;
    }
}
