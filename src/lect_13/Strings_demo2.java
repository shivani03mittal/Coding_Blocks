package lect_13;

import java.util.Scanner;

public class Strings_demo2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2= scn.next();
        System.out.println(s1+","+s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
