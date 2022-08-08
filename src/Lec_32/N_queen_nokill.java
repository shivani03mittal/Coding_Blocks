package Lec_32;

public class N_queen_nokill {
    public static void main(String[] args) {

        noKill(0,0,4,4,4,"",new boolean[4][4]);

    }
    public static void noKill(int r, int c, int total_r, int total_c, int QTP, String ans, boolean[][] board)
    {
//        +ve base acse
        if(QTP ==0)
        {
            System.out.println(ans);
            displayBoard(board);
            return;
        }

//        moving algo
        if(c == total_c)
        {
            r++;
            c=0;

        }
//        -ve BC
        if(r == total_r)
        {
            return;
        }

//        two calls include and exclude
        if(isSafe(board,r,c)) {
        board[r][c] = true;
        noKill(r, c + 1, total_r, total_c, QTP - 1, ans + "Q{" + r + "," + c + "}", board);
        board[r][c] = false;
    }
        noKill(r,c+1,total_r,total_c,QTP,ans,board );
    }

    public static boolean isSafe(boolean[][] board, int r, int c)
    {
//        check col
        for(int i=0;i<c;i++) {
            if(board[r][i]) {
                return false;
            }
        }

        //		left row
        for(int i=0;i<r;i++) {
            if(board[i][c]) {
                return false;
            }
        }
//        left above diag
        int R1 = r;
        int C1 = c;
        while( R1>=0 && C1 >=0	) {
            if(board[R1][C1]) {
                return false;
            }
            R1--;C1--;
        }

//        right above diag
        int R2 = r;
        int C2 = c;
        while( R2>=0 && C2 < board[0].length	) {
            if(board[R2][C2]) {
                return false;
            }
            R2--;
            C2++;
        }
        return true;

    }

    public static void displayBoard(boolean[][] board)
    {
        for(boolean[] row: board){
            for (boolean isSitting: row)
            {
                System.out.print(isSitting+ " ");
            }
            System.out.println();
        }

    }
}
