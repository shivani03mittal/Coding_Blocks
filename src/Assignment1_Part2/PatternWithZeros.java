package Assignment1_Part2;

import java.util.Scanner;

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        if(n>0 && n<100)
        {
            int row=1;
            int nst=1;
            while (row<= n)
            {
                int cst=1;
                while (cst<= nst)
                {
                    if(cst ==1 || cst==row)
                    {
                        System.out.print(row+"\t");
                    }
                    else
                        System.out.print("0\t");

                    cst++;
                }
                System.out.println();
                row++;
                nst++;

            }
        }
        else
        {
            System.exit(0);
        }
    }
}
//1
//2	2
//3	0	3
//4	0	0	4
//5	0	0	0	5