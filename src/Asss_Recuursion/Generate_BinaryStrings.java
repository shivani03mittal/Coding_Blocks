package Asss_Recuursion;

import java.util.Scanner;

public class Generate_BinaryStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Tn= scn.nextInt();
        for(int i=0; i<Tn;i++)
        {
            String s= scn.next();
//            System.out.println("SDF");
            generate_binary(s);
        }
    }
    public static void generate_binary(String s)
    {
        if(s.indexOf("?") <0)
        {
            System.out.print(s+" ");
            return;
        }

//        if(s.isEmpty())
//        {
//            return;
//        }

//            System.out.println("string "+s);
            int idx= s.indexOf("?");

//            System.out.println("idex"+idx);
            String chopped= s.substring(0,idx);
            String remaing= s.substring(idx+1);
//            System.out.println("chopped: "+chopped+" remain: "+remaing);
//
            generate_binary(chopped+"0"+remaing);
            generate_binary(chopped+"1"+remaing);

    }

}
