package Assignment2_Arrays;

import java.util.Scanner;

public class sortinginlineartime {

        public static void main (String args[]) {
            Scanner scn = new Scanner(System.in);
            int n= scn.nextInt();

            int[] arr= new int[n];
            for(int i=0; i< n;i++)
            {
                arr[i]= scn.nextInt();
            }

            int count0= 0;
            int count1=0;
            for(int i=0;i< n;i++)
            {
                if(arr[i]==0)
                {
                    count0++;
                }
                else if(arr[i]==1)
                    count1++;

            }

            for(int i=0; i<n;i++)
            {
                if(count0 !=0)
                {
                    System.out.print("0 ");
                    count0--;
                }
                else if(count1 !=0)
                {
                    System.out.print("1 ");
                    count1--;
                }
                else
                    System.out.print("2 ");
            }

        }
    }

