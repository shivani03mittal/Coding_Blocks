package Assignment1_Part2;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        if(n >20)
        {
            System.exit(0);
        }
        else
        {
            int row=1;
            int nst=n;
            int nsp= n-1;

            while (row <= n)
            {
//                print space
                int csp=1;
                while (csp <= nsp)
                {
                    System.out.print("  ");
                    csp ++;
                }
//                print star
                int cst= 1;
                while (cst <= nst)
                {
                    if(row  ==1 || row == n || cst ==1 || cst == nst)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                    cst++;

                }

                System.out.println();
                row++;
                nsp--;
            }
        }
    }
}
//5
//        * * * * *
//      *       *
//    *       *
//  *       *
//* * * * *
