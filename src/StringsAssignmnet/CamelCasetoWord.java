package StringsAssignmnet;

import java.util.Scanner;

public class CamelCasetoWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s= scn.nextLine();
        if(s.length()>1000 || s.length()<0)
        {
            System.exit(0);
        }
        printWords(s);
    }
    public static void printWords(String str)
    {
        int s=0;
        int l= 0;
        int i=0;
        while(i<str.length()) {


            if (str.charAt(i) >= 65 && str.charAt(i)<= 90)
            {   l=i;
                System.out.println(str.substring(s,l));
                s=i;
            }

            i++;
        }
        System.out.println(str.substring(l));

    }
}
