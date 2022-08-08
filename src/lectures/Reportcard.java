package lectures;

import java.util.Scanner;

public class Reportcard {
    public static void main(String[] args) {
//        for taking inputs, first create scanner and import it
        Scanner scn = new Scanner(System.in);

        int marks= scn.nextInt();
        int marks1= scn.nextInt();
        int marks2= scn.nextInt();
        int marks3= scn.nextInt();
//next int waits for the input , it can be in same line or in multiple lines
//        it automatically picks next integer.

        System.out.println(marks1);
        System.out.println(marks2);
        System.out.println(marks3);

//        int marks = 84;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else
            System.out.println("F");
    }
//    shortcut for formatting in intelij ctr+ alt+ l.
//    if you want order to not matter then use && (logical and) with conditions.
}
