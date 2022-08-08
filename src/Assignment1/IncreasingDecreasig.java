package Assignment1;

import java.util.Scanner;

public class IncreasingDecreasig {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();


        if(n<=2)
        {
            System.out.println(false);
            System.exit(0);
        }
        int previous = scn.nextInt();
        int i=1;
        boolean flag= true;
        int j=0;

        while(i<n)
        {
            int S= scn.nextInt();

            if(S == previous){
                flag= false;
            }
            else if (S < previous && j==0)
            {
                flag= true;
            }
            else if (S> previous && flag== true){
                flag= true;
                j=1;
            }
            else
            {
                flag= false;
            }
            previous= S;
            i++;
        }

        System.out.println(flag);
    }
}
//if (S == previous)
//            {
//                flag =false;
//            }
//            else if(S < previous && j==0)
//            {
//                flag= true;
//            }
//
//            else if (S > previous && flag== true);
//            {
//                j=1;
//                flag= true;
//            }
//