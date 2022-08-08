package Assignment1_Part2;

import java.util.Scanner;

public class NumberLadder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n>0 && n< 100)
        {
            int row =1;

            int k=1;
            while(row <= n)
            { int count=0;
                while (count <row)
                {
                    System.out.print(k +"\t");
                    k++;
                    count++;
                }
                System.out.println();
                row++;

            }
        }
        else {
            System.exit(0);
        }
    }
}
//1
//2	3
//4	5	6
//7	8	9	10