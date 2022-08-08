package Assignment1_Part2;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row = 1;
        int nsp = -1;
        int nst = n ;
        while (row <= 2*n-1) {
//            print star1
            int cst1 = 1;
            while (cst1 <= nst) {
                System.out.print("*");
                cst1++;
            }

//            print space
            int csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }

//            print star2
            int cst2 = 1;
            if (row == 1 || row == 2*n-1) {
                cst2 = 2;
            }
            while (cst2 <= nst) {

                System.out.print("*");
                cst2++;
            }

            System.out.println();
            row++;

            if (row > n) {
                nst++;
                nsp -= 2;
            } else {
                nst--;
                nsp += 2;
            }
        }
    }
}
//*********
//**** ****
//***   ***
//**     **
//*       *
//**     **
//***   ***
//**** ****
//*********