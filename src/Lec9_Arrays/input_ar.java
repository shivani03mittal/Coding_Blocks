package Lec9_Arrays;

import java.util.Scanner;

public class input_ar {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int size= scn.nextInt();
        int[] arr= new int[size];
        for(int i=0;i <arr.length;i++)
        {
            arr[i]= scn.nextInt();
        }

        for(int i:arr)
        {
            System.out.print(i+" "); //direct access to element no need to index
        }
        System.out.println();
    }
}
