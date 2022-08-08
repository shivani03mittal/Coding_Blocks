package Assignment1;

import java.util.Scanner;

public class SumOddEvenPlace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();

        int i = 1;
        int oddsum = 0, evensum = 0;

      while (n!=0)
      {
         int digit= n%10;
         if(i %2==0)
         {
             evensum+= digit;
         }
         else {
             oddsum+=digit;
         }
         i++;
         n/=10;
      }

        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
