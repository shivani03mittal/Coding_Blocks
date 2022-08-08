package Assignment1;

import java.util.Scanner;

public class Primefrim1ton {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int i=2;
        while(i<= n)
        {
            int factors=0;
            int k=2;
            while(k < i)
            {
                if((i % k) ==0)
                {
                    factors++;
                }

                k++;
            }

            if(factors ==0)
            {
                System.out.println(i);
            }

            i++;
        }
    }
}
