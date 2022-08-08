package Assignment1_Part2;

import java.util.Scanner;

public class PascalsTrianle {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        if(n>0 && n<100)
        {
            int row=0;
            while (row< n)
            {
                int cst=0;
               int num=1;
                while (cst <= row)
                {
                    System.out.print(num+"\t");
                    num= num* (row-cst)/(cst+1);
                    cst++;

                }

                System.out.println();
                row++;


            }
        }
        else
        {
            System.exit(0);
        }
    }
}
//1
//1	1
//1	2	1
//1	3	3	1
//1	4	6	4	1
//1	5	10	10	5	1

//use nCr relation
//nCr= n-1Cr+ n-1Cr-1
//nCr-1= r*nCr/(n-r+1)
