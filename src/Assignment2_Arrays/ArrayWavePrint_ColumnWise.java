package Assignment2_Arrays;

import java.util.Scanner;

public class ArrayWavePrint_ColumnWise {

        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int M = scn.nextInt();
            int N = scn.nextInt();
            int[][] mat = new int[M][N];
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                {
                    mat[i][j] = scn.nextInt();
                }
            }

            for(int i=0;i<N;i++)
            {
                for(int j=0;j<M;j++)
                { int toprint=j;
                    if(i % 2 ==1)
                    {
                        toprint = M-1-j;
                    }
                    System.out.print(mat[toprint][i]+", ");
                }
            }
            System.out.print("END");

        }
    }

