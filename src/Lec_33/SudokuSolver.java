package Lec_33;

import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] sudoku= new int[9][9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                sudoku[i][j]= scn.nextInt();
            }
        }
        System.out.println();
        System.out.println("====================");
//        display(sudoku);
        solve(sudoku,0,0);

    }
    public static void solve(int[][] sudoku, int r, int c)

    {

//        base case
        if(c==9)
        {
            r++;
            c=0;

        }
        if(r== 9)
        {
            display(sudoku);
            return;
        }


        if(sudoku[r][c] ==0)
        {
            for(int i=1;i<=9;i++)
            {
                if(isSafe(sudoku,r,c,i)) {
                    sudoku[r][c] = i;
                    solve(sudoku, r, c + 1);
                }
            }

            sudoku[r][c]= 0;
        }
        else {
            solve(sudoku,r,c+1);
        }
    }

    public static boolean isSafe(int[][] sudoku, int r, int c,int ele)
    {
//        check row
        for(int col=0;col<9;col++)
        {
            if(sudoku[r][col] ==ele)
            {
                return false;
            }
        }

//        check col
        for(int row=0;row<9;row++)
        {
            if(sudoku[row][c] ==ele)
            {
                return false;
            }
        }
//        each sqaure of 3*3 is also unique
        int br= r/3;
        int bc = c/3;
        for (int i=br*3; i<br*3+3;i++)
        {
          for (int j=bc*3; j<bc*3+3;j++)
          {
              if(sudoku[i][j] == ele)
                  return false;
          }

        }


        return true;
    }

    public static void display(int[][] sudoku)
    {
        for(int[] row: sudoku)
        {
         for(int ali: row)
         {
             System.out.print(ali+" ");
         }
            System.out.println();
        }

        System.out.println("================");;
    }
}
