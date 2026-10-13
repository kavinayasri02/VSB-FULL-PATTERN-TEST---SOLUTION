import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class MazeCheese {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if(line == null || line.trim().isEmpty())return;
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] maze = new int[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if(solveMaze(0,0,maze)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    private static boolean solveMaze(int r,int c,int[][]maze){
        if(r<0 || r>= maze.length|| c<0 || c>= maze[0].length){
            return false;
        }
        if(maze[r][c] == 0){
            return false;
        }
        if(maze[r][c] == 9){
            return true;
        }
        maze[r][c] = 0;
        boolean foundCheese = solveMaze(r+1, c, maze)||solveMaze(r-1, c, maze)||solveMaze(r, c+1, maze)||solveMaze(r, c-1, maze);
        return foundCheese;
    }
}
