package lectures;

import java.util.Scanner;

public class numbertill_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int i=1;
        int sum=0;
        while(i<= n)
        {
            System.out.println(i);
            sum= sum+i;
            i++;
        }
        System.out.println("sum: " + sum);
    }

}

