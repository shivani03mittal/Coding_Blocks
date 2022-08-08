package Assignment1_Part2;

import java.util.Scanner;

public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n %2 !=0)
        {
            int row =1;
            int nsp= n-1;
            int nst=1;
            int nsp2=-1;
            while (row<=n)
            {
//                print space
                int csp=1;
                while (csp<= nsp)
                {
                    System.out.print("  ");
                    csp++;
                }

//                print num1
                int cst1=1;
                int val=nst;
                while (cst1 <= nst)
                {
                    System.out.print(val+" ");
                    cst1++;
                    val--;
                }

//                print space
                int csp2=1;
                while (csp2<=nsp2)
                {
                    System.out.print("  ");
                    csp2++;
                }

//                print n2
                int cst2=1;
                if(row==1 || row ==n)
                {
                    cst2=2;
                }
                while (cst2 <= nst)
                {
                    System.out.print(cst2+" ");
                    cst2++;

                }

                System.out.println();
                row++;
                if(row > n/2+1)
                {
                    nsp +=2;
                    nst--;
                    nsp2-=2;
                }
                else
                {
                    nsp-=2;
                    nst++;
                    nsp2+=2;
                }
            }

        }
        else {
            System.exit(0);
        }
    }
}
//            1
//        2 1   1 2
//    3 2 1       1 2 3
//4 3 2 1           1 2 3 4
//    3 2 1       1 2 3
//        2 1   1 2
//            1