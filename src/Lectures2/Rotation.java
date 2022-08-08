package Lectures2;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int num=n;
        int rotation= scn.nextInt();

//        count digits
        int nod=0;
        while (n>0)
        {
            n= n/10;
            nod++;
        }

//        becuase of periodicity we figured out that rotation % nod will go
        if(rotation> nod)
        {
            rotation= rotation % nod;
        }
        while (rotation>0)
        {
            int digit= num%10;
            int part= num/10;
            num= digit*(int) Math.pow(10,(nod-1))+part;
            System.out.println(num);
            rotation--;
        }

    }
}
