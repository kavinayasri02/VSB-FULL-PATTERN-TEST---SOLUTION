import java.util.Scanner;
public class TraineeRounds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]tot= new int[3];
        for(int r =0;r<3;r++){
            for(int t=0;t<3;t++){
                int oxy = sc.nextInt();
                if(oxy < 1 || oxy>100){
                System.out.println("INVALID INPUT");
                return;
            }
              tot[t] += oxy;
        }
    }
    int[]tAvg = new int[3];
    int maxAvg = 0;
    for(int i =0;i<3;i++){
        tAvg[i] = (int)Math.round(tot[i]/3.0);
        if(tAvg[i] > maxAvg){
            maxAvg = tAvg[i];
        }
    }
    if(maxAvg < 70){
        System.out.println("All trainees are unfit");
    }else{
        for(int i=0;i<3;i++){
            if(tAvg[i] == maxAvg){
                System.out.println("Trainee Number : " + (i+1));
            }
        }
    }
}
}