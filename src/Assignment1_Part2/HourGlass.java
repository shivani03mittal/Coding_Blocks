package Assignment1_Part2;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        int n= scn.nextInt();

        if(n<=20)
        {
            int row=1;

            int nsp=0;
            int nn = n;

            while(row <= 2*n+1)
            {
//               print space
                int csp=1;
                while (csp<=nsp)
                {
                    System.out.print("  ");
                    csp++;
                }
//                print numbers
                int cnn=nn;
                int v=1;
                while (v <= 2*nn+1)
                {
                    if(v> nn )
                    {
                        System.out.print(cnn+" ");
                        cnn++;
                    }
                    else
                    {
                        System.out.print(cnn+" ");
                        cnn--;
                    }
                    v++;
                }
                System.out.println();
                row++;

                if(row >n+1)
                {
                    nsp--;
                    nn++;
                }
                else
                {
                    nsp++;
                    nn--;
                }
            }
        }
        else
        {
            System.exit(0);
        }
    }
}
//5 4 3 2 1 0 1 2 3 4 5
//  4 3 2 1 0 1 2 3 4
//    3 2 1 0 1 2 3
//      2 1 0 1 2
//        1 0 1
//          0
//        1 0 1
//      2 1 0 1 2
//    3 2 1 0 1 2 3
//  4 3 2 1 0 1 2 3 4
//5 4 3 2 1 0 1 2 3 4 5