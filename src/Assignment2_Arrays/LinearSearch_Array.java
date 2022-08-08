package Assignment2_Arrays;

import java.util.Scanner;

public class LinearSearch_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        if(n <0)
            System.exit(0);

        int i=0;
        int[] arr= new int[n];
        while(i< n)
        {
            arr[i]= s.nextInt();
            i++;
        }
        int M= s.nextInt();
        int result= LinearSearch(arr,n,M);
        System.out.println(result);

    }
    public static int LinearSearch(int[] arr, int n,int M)
    {

        for(int k=0; k<n;k++)
        {
            if(arr[k]== M)
                return k;

        }
        return -1;
    }


}
