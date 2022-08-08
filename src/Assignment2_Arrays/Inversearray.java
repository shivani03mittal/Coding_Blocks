package Assignment2_Arrays;

import java.util.Scanner;

public class Inversearray {
        public static void main(String args[]) {
            // Your Code Here
            Scanner scn = new Scanner(System.in);
            int N = scn.nextInt();

            int[] arr= new int[N];
            int[] arr1= new int[N];
            int i=0,k=0;
            while(i <N)
            {
                arr[i]= scn.nextInt();
                i++;
            }

            inverse(arr, N,k,arr1);
            for(int j=0; j<N; j++)
            {
                System.out.print(arr1[j]+" ");
            }

        }

        public static void inverse(int[] arr, int N,int k, int[] arr1)

        {
           if(k<N)
           {
               int val = arr[k];
               arr1[val]= k;
               inverse(arr, N,k+1,arr1);
           }

        }
    }
