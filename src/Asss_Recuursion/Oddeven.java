package Asss_Recuursion;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PDI(n);
    }
    public static void PDI(int n)
    {
        if(n==0)
        {
            return;
        }
        if(n%2 !=0)
        System.out.println(n);
        PDI(n-1);
        if(n%2==0)
        System.out.println(n);
    }
}
