package Assignment1_Part2;

import java.util.Scanner;

public class InvertedHorglass {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

//        if(n>0 && n<10) {

            int row = 1;
            int nst = 1;
            int nsp = 2 * n - 1;
            while (row <= 2*n+1) {
//            print start1
                int cst1 = 1;
                int val=n;
                while (cst1 <= nst) {
                    System.out.print(val);
                    cst1++;
                    val--;
                }

//            print space;
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(" ");
                    csp++;
                }

//            print star2
                int cst2 = cst1-1;
                int val2= val+1;
                if (row == n+1) {
                    cst2 = cst1-2;
                    val2=val+2;
                }
                while (cst2 !=0) {
                    System.out.print(val2);
                    cst2--;
                    val2++;
                }


                System.out.println();
                row++;

                if(row >n+1)
                {
                    nst--;
                    nsp+=2;
                }
                else {
                    nst++;
                    nsp -= 2;
                }
            }
//        }
//        else {
//            System.exit(0);
//        }
    }
}

//5         5
//54       45
//543     345
//5432   2345
//54321 12345
//54321012345
//54321 12345
//5432   2345
//543     345
//54       45
//5         5