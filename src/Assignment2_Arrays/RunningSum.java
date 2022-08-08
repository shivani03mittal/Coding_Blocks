package Assignment2_Arrays;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i< n;i++)
        {
            arr[i]= scn.nextInt();
        }

        runsum(arr);
    }
    public static void runsum(int[] arr)
    {
        for(int i= 1;i<arr.length;i++)
        {
            arr[i]= arr[i]+arr[i-1];
        }

        for( int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");;
        }
    }
}
