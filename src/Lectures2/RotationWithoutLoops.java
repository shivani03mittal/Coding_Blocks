package Lectures2;

import java.util.Scanner;

public class RotationWithoutLoops {
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
        rotation= rotation % nod;


        int powe= (int)Math.pow(10,rotation);
        int part1= num/powe;
        int part2=num% powe;
//length of part 1= rotations
//        length of part 2 = nod- rotations

        int mult=(int) Math.pow(10,(nod-rotation));
        int ans= part2*mult+part1;

        System.out.println(ans);

    }
}
