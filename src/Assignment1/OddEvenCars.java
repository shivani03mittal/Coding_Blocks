package Assignment1;

import java.util.Scanner;

public class OddEvenCars {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int N= scn.nextInt();

        int i=1;
        while(i<=N)
        {
            long plateno= scn.nextInt();
            long oddsum=0, evensum=0;

            while(plateno!=0)
            {
//                odd digits sum
                long digit= plateno%10;
                if(digit%2==0)
                {
                    evensum=evensum+digit;
                }
                else
                    oddsum=oddsum+digit;

                plateno/=10;
            }

            if(oddsum%3==0 || evensum%4==0)
                System.out.println("Yes");

            else
                System.out.println("No");

            i++;
        }
    }
}
