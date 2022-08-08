package Asss_Recuursion;

import java.util.Scanner;

public class generate_parant {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        genpar(n,n,"");
    }
    public static void genpar(int open, int close, String path)
    {
        if(open==0 && open == close)
        {
            System.out.println(path);
            return;
        }

        if(open > close)
        {
            return;
        }

        if(close>0)
        genpar(open,close-1,path+")");

        if (open> 0)
            genpar(open-1,close,path+"(");
    }
}
