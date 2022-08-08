package lect_13;

import java.util.Scanner;

public class SkyisBlue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ss = scn.nextLine();
        System.out.println("=" + ss);

        // reversing the string
        Reverse(ss);

    }

    public static void Reverse(String str) {
        while (true) {

            int indx = str.lastIndexOf(" ");
//        String word= str.substring(indx+1, str.length());
            String word = str.substring(indx + 1);
            System.out.println(word);
            if(indx ==-1) break;
            str = str.substring(0, indx);
//      apply same to rem part
        }


    }

}
