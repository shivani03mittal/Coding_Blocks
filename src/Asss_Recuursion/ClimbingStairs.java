package Asss_Recuursion;

import java.util.Scanner;

public class ClimbingStairs {
    static int count=0;
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        climb(0,"",n);
        System.out.println(count);
    }
    public static void climb(int curr, String path, int dest)
    {
//        base cases
        if(curr == dest)
        {
            count++;
            System.out.println(path);
            return;

        }
        if(curr>dest)
        {
            return;
        }
        climb(curr+1,path+" 1 Step",dest);
        climb(curr+2,path+" 2 Step",dest);

    }
}
