package Assignment2_Arrays;

import java.util.Scanner;

public class zeroesattheend {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N ;i++)
        {
            arr[i] = scn.nextInt();
        }

        // two pointer;
        int left =0;
        int right = N-1;
        while(left < right)
        {
            if(arr[left] == 0 && arr[right] !=0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if(arr[left] !=0) left++;

                // if(arr[right] == 0)
            else right --;

        }

        display(arr);

    }

    public static void display(int[] arr)
    {
        for(int i=0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
