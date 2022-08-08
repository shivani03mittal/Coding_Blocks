package Assignment2_Arrays;

import java.util.Scanner;

public class SquaresofSorted {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n=  scn.nextInt();

        if(n<1 || n> 10000)
        {
            System.exit(0);
        }

        int[] nums= new int[n];

        for(int i=0; i<n; i++)
        {
            nums[i]=scn.nextInt();

        }

        for(int i=0;i<n;i++)
        {
            nums[i]= nums[i]* nums[i];
        }

        sort(nums);

    }

    public static void sort(int[] arr)
    {
        int last = arr.length-1;
        while(last >0)
        {
            int max_ind= 0;
            for( int i=0;i <=last;i++)
            {
                if(arr[i]> arr[max_ind])
                {
                    max_ind=i;
                }
            }
            // swap
            if(max_ind != last)
            {
                int temp = arr[max_ind];
                arr[max_ind]= arr[last];
                arr[last]= temp;
            }

            last--;
        }

        for(int i=0;i <arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
