package lectures;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int row =1;
        int nst=1;
        int nsp= 2*n-3;
        while (row<=n)
        {
//            print start1
            int cst1=1;
            while (cst1<= nst)
            {
                System.out.print("* ");
                cst1++;
            }

//            print space;
            int csp=1;
            while (csp<= nsp)
            {
                System.out.print("  ");
                csp++;
            }

//            print star2
            int cst2=1;
            if(row== n)
            {
                cst2=2;
            }
            while (cst2<= nst)
            {
                System.out.print("* ");
                cst2++;
            }


            System.out.println();
            row++;
            nst++;
            nsp-=2;
        }
    }
}

//*               *
//* *           * *
//* * *       * * *
//* * * *   * * * *
//* * * * * * * * *