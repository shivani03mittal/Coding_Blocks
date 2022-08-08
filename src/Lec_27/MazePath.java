package Lec_27;

public class MazePath {
    public static void main(String[] args) {
        mazesolve(0,0,"",2,2);

    }

    public static void mazesolve(int r, int c, String path, int dest_r, int dest_c)
    {

        if(r== dest_r && c==dest_c)
        {
            System.out.println(path);
            return;
        }

        if(r > dest_r || c>dest_c)
        {
            return;
        }
//      move right
        mazesolve(r, c+1, path+ "R",dest_r,dest_c);
//        move down
        mazesolve(r+1,c,path+"D",dest_r,dest_c);
    }
}
