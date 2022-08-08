package Assignment1_Part2;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        if(n>0 && n<10)
        {
            int row=1;
            int k=1;
            int nn=1;
            int nsp= n-1;
            while (row <= n)
            {
//                print space
                int csp=1;
                while (csp<= nsp)
                {
                    System.out.print(" \t");
                    csp++;
                }

//                print number
                int cst=1;
                int v=row, y=row;
                while (cst<= nn)
                {

                    if(y<nn)
                    {
                        System.out.print(v+"\t");
                        v++;
                    }

                    else
                    {
                        System.out.print(v+"\t");
                        v--;
                    }

                    y++;
                    cst++;
                }

                System.out.println();
                row++;
                nsp--;
                nn+=2;
            }
        }
        else
        {
            System.exit(0);
        }
    }
}

//4
// 	 	 	1
// 	 	2	3	2
// 	3	4	5	4	3
//4	5	6	7	6	5	4