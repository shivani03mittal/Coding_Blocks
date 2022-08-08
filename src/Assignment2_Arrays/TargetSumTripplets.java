package Assignment2_Arrays;

import java.util.Scanner;

public class TargetSumTripplets {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        if(n>1 && n<1000)
        {
            int[] arr= new int[n];
            for(int i=0;i< n;i++)
            {
                arr[i]= scn.nextInt();
            }

            int t= scn.nextInt();
            sort(arr);
            tripplets(arr,n,t);
        }
    }
    public static  void sort(int[] arr)
    {
        for(int count=1; count<arr.length; count++)
        {
            for(int i=0;i< arr.length-2;i++)
            {
                if(arr[i] >arr[i+1])
                {
                    int temp= arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void tripplets(int[] arr, int n, int t)
    {
        for(int i=0; i<n-2 ;i++)
        {

//
            
        }
    }
}
//1 2 3 4 5 6 7 8 9
//0 1 2 3 4 5 6 7 8