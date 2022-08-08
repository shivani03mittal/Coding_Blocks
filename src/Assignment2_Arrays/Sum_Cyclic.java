package Assignment2_Arrays;

import java.util.Scanner;

public class Sum_Cyclic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt() ;

        if(n<1 || n>100000)
            System.exit(0);

        int[] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]= scn.nextInt();
        }

        int oper= scn.nextInt();

        for(int i=1;i<= oper;i++)
        {
            int x= scn.nextInt();
            if(x<0 || x>=n)
              System.exit(0);
            changearr(arr,n,x);

        }
//        display(arr);
        sum(arr);
    }

    public static void changearr(int[] arr, int n,int x)
    {
        int [] arr1= new int[n];
        for(int i=0; i<n;i++)
        {
            arr1[i]=arr[i];
        }
        for (int j=0; j<n;j++)
        {
            int k= j-x;
            if(k<0)
                k=k+n;
            arr[j]= arr[j]+arr1[k];
        }


    }

    public static void display(int [] arr)
    {
        for(int i=0; i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sum(int[] arr)
    {
        int sum= 0;
        for(int i=0; i< arr.length;i++)
        {
            sum= sum+ arr[i];
        }
//        sum= sum %(10^9+7);
        System.out.println(sum);
    }
}
