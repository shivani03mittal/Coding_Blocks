package Assignment2_Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int N = scn.nextInt();

        if(N<0)
            System.exit(0);

        int i=0;
//        make array
        int[] arr= new int[N];
        while (i<N)
        {
            arr[i]= scn.nextInt();
            i++;
        }
//        reverse array
        Reverse(arr, N);

    }

    public static void Reverse(int[] arr, int n)
    {
        for(int k=n-1; k>=0;k--)
        {
            System.out.println(arr[k]);
        }
    }
}
