package Arrays_BasicQues;

import java.util.Scanner;

public class ReverseArray_twoPoint {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        ReverseSwap(arr);

        diaply(arr);

    }
    public static void Reverse(int[] arr)
    {
        int[] arr1= new int[arr.length];
        for (int i=0; i< arr.length;i++)
        {
            arr1[i]= arr[arr.length -1 -i];
        }
        for (int i=0; i< arr.length;i++)
        {
            arr[i]= arr1[i];
        }
//        now copy this to the original // but long and stupid approach
    }

    public static void ReverseSwap(int[] arr)
    {
        int start=0;
        int end= arr.length -1;

        while (start < end)
        {
//            swap
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end --;
        }

    }
    public static void diaply(int[] arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
