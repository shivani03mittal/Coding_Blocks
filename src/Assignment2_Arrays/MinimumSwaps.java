package Assignment2_Arrays;

import java.util.Scanner;

public class MinimumSwaps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n<1 || n> 100000)
            System.exit(0);

       int [] arr= new int[n];

        for(int i=1;i<n ;i++)
        {
            int k= scn.nextInt();
            if(k <1 || k >n)
            {
                System.exit(0);
            }
            else
                arr[i]=k;
        }

        sort(arr);
    }

    public  static  void  sort(int[] arr)
    {
        int last= arr.length-1;
        int swapcount=0;

        while (last>0)
        {
            int maxind=0;
            for(int i=0; i< last;i++)
            {
                if(arr[i] > arr[maxind])
                    maxind=i;
            }

//            swap
            if(maxind != last) {

                int temp = arr[maxind];
                arr[maxind] = arr[last];
                arr[last] = temp;
                swapcount++;
            }

            last--;
        }

        System.out.println(swapcount);
    }
}
