package Assignment1;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
//        int N= scn.nextInt();

        int i=1;
        int sum=0;
        while(i!=0)
        {
            int num= scn.nextInt();
            sum+= num;
            if(sum>=0)
            {
                System.out.println(num);
            }
            else
            {
                break;
            }

            i++;
        }
    }
}
