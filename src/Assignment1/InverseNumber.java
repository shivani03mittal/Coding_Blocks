package Assignment1;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        int n= scn.nextInt();

        int i=1;
        int inverse=0;
        while (n !=0)
        {
            int digit= n % 10;
            inverse+= i* (int)(Math.pow(10,digit-1));

            n/=10;
            i++;

        }
        System.out.println(inverse);
    }




}
