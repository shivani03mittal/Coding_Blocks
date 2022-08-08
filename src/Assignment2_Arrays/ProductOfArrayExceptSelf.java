package Assignment2_Arrays;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        if(n>1)
        {
            long[] arr= new long[n];
            for(int i=0; i<n;i++)
            {
                arr[i] = scn.nextInt();
            }

            long product =1;
            int count=0;
            for(int i=0; i<n;i++)
            {
                if(arr[i]==0)
                {
                    count++;
                }
                else
                    product= product* arr[i];
            }

            if(count >1)
            {
                for(int i=0; i<n;i++)
                {
                    System.out.print("0 ");
                }
            }
            else{

                for(int i=0; i<n;i++)
                {
                    if(count ==1)
                    {
                        if(arr[i]==0)
                        {
                            System.out.print(product+" ");
                        }
                        else
                        {
                            System.out.print("0 ");
                        }
                    }
                    else
                    {
                        System.out.print( product /arr[i] + " ");
                    }
                }

            }

        }

    }
}

