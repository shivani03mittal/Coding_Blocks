package lectures;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row = 1;
        int nsp = -1;
        int nst = n / 2 + 1;
        while (row <= n) {
//            print star1
            int cst1 = 1;
            while (cst1 <= nst) {
                System.out.print("* ");
                cst1++;
            }

//            print space
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }

//            print star2
            int cst2 = 1;
            if (row == 1 || row == n) {
                cst2 = 2;
            }
            while (cst2 <= nst) {

                System.out.print("* ");
                cst2++;
            }

            System.out.println();
            row++;

            if (row > n / 2 + 1) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
        }
    }
}
//* * * * * * *
//* * *   * * *
//* *       * *
//*           *
//* *       * *
//* * *   * * *
//* * * * * * *