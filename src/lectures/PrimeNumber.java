package lectures;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        int factors = 0;

        while (i <= n) {
            if (n % i == 0) {
                factors++;
//                System.out.println(i);
            }

            i++;
        }


        if (factors== 2)
            System.out.println("Prime Number");

        else
            System.out.println(" not prime");
    }
}
