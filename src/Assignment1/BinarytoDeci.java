package Assignment1;

import java.util.Scanner;

public class BinarytoDeci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int i=0;
        while( i< n)
        {
            int bn= scn.nextInt();
            int deci=0;
            int p=1;

//            System.out.println( p);
            while(bn!= 0)
            {
                int digit= bn%10;
                deci= deci+ (digit* p);

                p*=2;
                bn /=10;

            }
            System.out.println(deci);
//            p*=2;
            i++;

        }
    }
}
