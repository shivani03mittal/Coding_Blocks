package Assignment1;

import java.util.Scanner;

public class ChecbawwaandNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        long n = scn.nextLong();
        long mini=0;
        long a=1;
        while(n!=0)
        {
            long rem = n % 10;
            if(rem==9)
                rem=rem;
            else if(rem > (9-rem))
            {
                rem= 9-rem;
            }

            else
            {
                rem=rem;
            }
            n=n/10;
            mini= a*rem+mini;
            a=a*10;

        }
        System.out.println(mini);
    }
}

//edge cases: when number starts wiht zero then let it be zero
// number starts wit 9 should not be chnaged to zero at 1st place  that is number of digits needs to be same;
