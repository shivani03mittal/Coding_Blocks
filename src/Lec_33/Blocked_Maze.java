package Lec_33;

public class Blocked_Maze {
    public static void main(String[] args) {
        int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
        solve(0, 0,  maze, "", new boolean[maze.length][maze[0].length]);
    }
    public  static void solve(int r, int c,int[][] maze,String path, boolean[][] visited )
    {

//        bse case
//        -ve
        if(r<0 || r== maze.length || c<0 || c==maze[0].length || maze[r][c]==1 || visited[r][c]==true)
        {
            return;
        }
//        +ve bc
        if(r== maze.length-1 && c== maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
//        go down
        visited[r][c]=true;
        solve(r+1,c,maze,path+"D",visited);
        //        go up
        solve(r-1,c,maze,path+"U",visited);
        //        go left
        solve(r,c-1,maze,path+"L",visited);
        //        go right
        solve(r,c+1,maze,path+"R",visited);
        visited[r][c]=false;
    }
}
