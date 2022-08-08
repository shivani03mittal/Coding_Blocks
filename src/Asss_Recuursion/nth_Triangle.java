package Asss_Recuursion;

import java.util.Scanner;

public class nth_Triangle {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        solve(n, "",0);
    }
    public static void solve(int n,String path, int sum)
    {
//        base case
        if(n==0)
        {
            System.out.println(path+ sum);
            return;
        }
        sum= sum+n;
        solve(n-1,path+n,sum);
//        System.out.println(n);

    }
}
