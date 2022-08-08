package Assignment1;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int N= scn.nextInt();
        int num=N;

        int i=2;
        int sum=0;
        int digitsum=0;
        while (i<=N)
        {
            while(N%i == 0) {
                System.out.println(i+" ");
                int factor=i;
                while(factor!=0)
                {
                    int digit= factor%10;
                    sum+=digit;
                    factor=factor/10;
                }

//                System.out.println(sum);
                N = N/i;
            }
            i++;

        }
        if(N>2) {
            System.out.println("hi"+N);

        }

        while (num!=0)
        {
            int digit= num%10;
            digitsum+= digit;

            num/=10;
        }
//        System.out.println(sum);
//        System.out.println(digitsum);
        if(digitsum== sum)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
