package Assignment1;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();

        int i=0;

        while (i<t)
        {
            int m=0;
            int sum_m=0, sum_n=0;
            int n=0;
            int M= scn.nextInt();
            int N= scn.nextInt();

            while (M>sum_m && N>sum_n){
                m= n+1;
                sum_m= sum_m+m;
                System.out.println("m" +m);
                System.out.println(sum_m);
                n=m+1;
                sum_n+=n;
                System.out.println("n"+ n);
                System.out.println(sum_n);

            }

            if(M>sum_m)
                System.out.println("Aayush");
            else
                System.out.println("Harshit");

            i++;

        }
    }
}
