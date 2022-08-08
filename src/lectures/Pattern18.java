package lectures;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        int n = scn.nextInt();

        int row =1;
        int nsp= n/2;
        int nst=1;
        while( row <= n)
        {
//            printspace
            int csp = 1;
            while (csp <= nsp)
            {
                System.out.print("  ");
                csp++;
            }

//            print star
            int cst=1;
            while (cst <= nst)
            {
                System.out.print("* ");
                cst++;
            }

            System.out.println();
            row++;
            if(row >n/2 +1)
            {
                nsp++;
                nst-=2;
            }
            else
            {
                nsp--;
                nst+=2;
            }
        }
    }
}

//      *
//    * * *
//  * * * * *
//* * * * * * *
//  * * * * *
//    * * *
//      *