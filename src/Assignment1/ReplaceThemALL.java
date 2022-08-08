package Assignment1;

import java.util.Scanner;

public class ReplaceThemALL {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long num= scn.nextLong();
        long n= num;
        long a=1;
        if(n==0)
            num=5;

        else{
            while(n!=0)
            {
                long digit= n%10;
                if(digit==0)
                {
                    digit=5;
                    num=a*digit+num;
                }
                a*=10;
                n/=10;

            }
        }

        System.out.println(num);

        // int a = 1;
        // 102 -> 1*2 + 10*0+100*1 =
        // int rem = num%10;2

        //        add = a*rem+add; add = 2
//        a = a*10;
//        num/=10;

//       long n= Long.parseLong(num);
//       long finaln=n;
//
//        while( n!=0)
//        {
//            long digit= n%10;
//            if(digit==0)
//            {
//                digit=5;
//                finaln=(n/10)*10+digit;
//
//            }
//            n=n/10;
//
//
//        }
//        System.out.println(num);
//        System.out.println(finaln);

//use string to solve
    }
}

