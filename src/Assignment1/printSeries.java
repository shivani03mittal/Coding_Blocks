package Assignment1;

import java.util.Scanner;

public class printSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int i=1;
        int count=1;

        while(i !=0)
        {
            if(count<=n1)
            {
                int term = 3*i +2;
                if(term %n2 !=0)
                {
                    System.out.println(term);
                    count++;
                }

            }

            i++;


        }

    }
}
