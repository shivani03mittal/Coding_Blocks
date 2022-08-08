package Arrays_sorting;

import java.util.Scanner;

public class Array2D_input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row= scn.nextInt();
        int col= scn.nextInt();

        int[][] mat = new int[row][col];
        for(int r = 0; r< mat.length;r++)
        {
            for(int c=0;c <mat[r].length;c++  ){
                mat[r][c]= scn.nextInt();
            }
        }

        dis(mat);

    }

    public static void dis(int[][] mat)
    {
        for(int r=0; r< mat.length;r++)
        {
            for (int c=0; c< mat[r].length;c++)
            {
                System.out.print(mat[r][c]+" ");

            }
            System.out.println();

//            for(int[] row : mat)
//            {
//                for(int ele : row){
//                    System.out.print(ele+" ");
//                }
//                System.out.println();
//            }
        }
    }
}

