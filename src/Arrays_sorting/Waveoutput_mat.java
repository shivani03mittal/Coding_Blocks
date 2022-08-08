package Arrays_sorting;

import java.util.Scanner;

public class Waveoutput_mat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] mat = new int[4][4];
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
        for(int c=0;c< mat.length;c++)
        {
            for(int r=0;r< mat.length;r++)
            {
                int toprint =r;
                if(c %2 ==1){
                    toprint = mat.length -1 -r;
                }
                System.out.print(mat[toprint][c]+" ");
            }
            System.out.println();
        }
    }
}
//
//in: 11 12 13 14
//21 22 23 24
//31 32 33 34
//41 42 43 44
//
//out: 11 21 31 41
//42 32 22 12
//13 23 33 43
//44 34 24 14


//homework
