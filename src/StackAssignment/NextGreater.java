package StackAssignment;

import java.util.Scanner;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++)
                arr[i] = scn.nextInt();

            nextLarger(arr);

            t--;
        }

    }

    // Function to print Next Greater Element for each element of the array
    public static void nextLarger(int[] arr)
    {
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int var =arr[i];
            while(!s.isEmpty() && s.peek() < var)
            {

                System.out.println(s.pop()+","+var);
            }
            s.push(var);
        }

        while(!s.isEmpty())
        {
            System.out.println(s.pop()+",-1");
        }

    }

}
