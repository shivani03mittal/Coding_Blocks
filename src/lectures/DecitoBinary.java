package lectures;

import java.util.Scanner;

public class DecitoBinary {
    public static void main(String[] args) {
//        int n=75;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m=1;
        int an=0;
        while(n!=0)
        {
            int rem= n %2;
            an= an+ rem* m;
            n=n/2;
            m*=10;
        }
        System.out.println(an);
    }
//    divide by destination base and multiply by base of source
//    this follows only when either source/ desi is 10base
//    otherwise follow source=> decimal=> destination
}



//greatest octal number is 8^n -1;
//range for any number is 2^n -1,ex 2^8-1= 255;
// negtaive or signed have 2^(n-1)-1
