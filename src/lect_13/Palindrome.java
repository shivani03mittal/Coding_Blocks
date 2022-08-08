package lect_13;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1= scn.next();

        System.out.println(isPalin(s1));
        printPlainSubs(s1);


    }
    public static void printPlainSubs(String str)
    {
        for( int i=0; i<= str.length();i++)
        {
            for(int j=i+1;j<= str.length();j++)
            {
                String ss= str.substring(i,j);
                if(isPalin(ss))
                {
                    System.out.println(ss);
                }
            }
        }


    }
    public  static boolean isPalin(String str)
    {
        int si= 0;
        int li= str.length()-1;
        while (si<li)
        {
            if(str.charAt(si) != str.charAt(li)){
                return false;

            }
            si++;
            li--;
        }
        return true;
    }

}
