package Assignment1_Part2;

import java.util.Scanner;

public class PatternFibbonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        if (n>0 && n<100)
        {
            int a=0;
            int b=1;
            int row=1;
            int c=0;
            while (row <=n)
            {
                int count =1;

                while (count<=row)
                {
                    c= a+b;
                    System.out.print(a+"\t");
                    a=b;
                    b=c;
                    count++;
                }
                System.out.println();
                row++;
            }
        }
        else
        {
            System.exit(0);
        }
    }
}
//0
//1	1
//2	3	5
//8	13	21	34