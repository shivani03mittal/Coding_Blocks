package Assignment2_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sortjustzeroesandones {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int[] arr= new int[N];
    for(int i=0;i<N ;i++)
    {
        arr[i]= scn.nextInt();

    }

//    sort(arr);
    selection_sort(arr);

}

    public static void sort(int[] arr)
    {
        for(int count =0;count< arr.length;count++) {
            for (int i = 0; i < arr.length - 2; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
        display(arr);

    }

    public static void selection_sort(int[] arr){
//        finds max element at put at last
        int last= arr.length-1;

        while (last >0) {
            int max_idx = 0;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > arr[max_idx]) {

                    max_idx = i;
                }
            }
            //                swap
            if(max_idx != last) {
                System.out.println(max_idx + " swaping " + last);
                int temp = arr[max_idx];
                arr[max_idx] = arr[last];
                arr[last] = temp;
            }
//            System.out.println(Arrays.toString(arr));
//update last
            last--;
        }
        display(arr);
    }
    public static void display(int[] arr)
    {
        for( int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");;
        }
    }

}
