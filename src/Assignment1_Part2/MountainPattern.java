package Assignment1_Part2;

import java.util.Scanner;

public class MountainPattern {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        if(n>0 && n<10) {

            int row = 1;
            int nst = 1;
            int nsp = 2 * n - 3;
            while (row <= n) {
//            print start1
                int cst1 = 1;
                while (cst1 <= nst) {
                    System.out.print(cst1);
                    cst1++;
                }

//            print space;
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(" ");
                    csp++;
                }

//            print star2
                int cst2 = cst1-1;
                if (row == n) {
                    cst2 = cst1-2;
                }
                while (cst2 !=0) {
                    System.out.print(cst2);
                    cst2--;
                }


                System.out.println();
                row++;
                nst++;
                nsp -= 2;
            }
        }
        else {
            System.exit(0);
        }
    }
}
//1     1
//12   21
//123 321
//1234321
