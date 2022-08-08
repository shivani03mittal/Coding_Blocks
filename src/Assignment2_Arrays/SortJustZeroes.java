package Assignment2_Arrays;

import java.util.Scanner;

public class SortJustZeroes {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N ;i++)
        {
            arr[i]= scn.nextInt();

        }

        sort(arr);
    }

    public static void sort(int[] arr)
    {
        // count zeroes
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        display(arr,count);
    }

    public static void display(int[] arr, int count)
    {
        for(int i=0; i< arr.length;i++)
        {
            if(count !=0)
            {
                System.out.print("0 ");
                count--;
            }
            else
            {
                System.out.print("1 ");
            }

        }
    }
}
