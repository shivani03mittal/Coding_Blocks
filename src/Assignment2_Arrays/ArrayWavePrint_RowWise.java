package Assignment2_Arrays;

import java.util.Scanner;

public class ArrayWavePrint_RowWise {


        public static void main(String args[]) {
            // Your Code Here
            Scanner scn = new Scanner(System.in);
            int m = scn.nextInt();
            int n = scn.nextInt();
            int[][] mat = new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j] = scn.nextInt();
                }
            }

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int idx= j;
                    if(i%2 ==1)
                    {
                        idx= n-1-j;
                    }
                    System.out.print(mat[i][idx] +", ");
                }
            }
            System.out.print("END");
        }
    }


