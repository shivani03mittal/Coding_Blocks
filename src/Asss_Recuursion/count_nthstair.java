package Asss_Recuursion;

import java.util.Scanner;

public class count_nthstair {
    static int count =0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        climb(0,"",n,false);
        System.out.println(count);
    }
    public static void climb(int curr,String path ,int dest, boolean last_two)
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
        if(last_two==false)
            climb(curr+1,path+" 1,",dest,false);
        climb(curr+2,path+ " 2,",dest,true);

    }
}
