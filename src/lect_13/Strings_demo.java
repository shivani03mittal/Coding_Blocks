package lect_13;

import java.util.Scanner;

public class Strings_demo {
    public static void main(String[] args) {
        String str= "akndj";
        char[] arr= new char[3];
        arr[0]= 'a';
        arr[1]='b';
        arr[2]='c';

        System.out.println(str);
        System.out.println(arr);

//        size??
        System.out.println(str.length());
        System.out.println(arr.length);

//        get char at index
        System.out.println(arr[1]);
        System.out.println(str.charAt(1));
//        last index
        System.out.println(arr[arr.length-1]);
        System.out.println(str.charAt(str.length()-1));

//        substring
//        no of substrings = n*(n+1)/2
        System.out.println(str.substring(0,2));
//        first index is inclusive and ending is exclusive.
        System.out.println(str.substring(1,1));
        for( int i=0; i<= str.length();i++)
        {
            for(int j=i+1;j<= str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }

//        how to take string input
//        Scanner scn= new Scanner(System.in);
//        String s1= scn.next();
//        String s2= scn.next();
//        String s3= scn.next();
//        System.out.println(s1+" "+s2);

//        to find the index
        System.out.println(str.indexOf('n')); // gives the index of first occ.
        System.out.println(str.lastIndexOf('n')); //gives the index of last occurance

//        prefix and suffix
        System.out.println(str.startsWith("abc"));//suffix
        System.out.println(str.endsWith("abc"));//prefix

//        compare two strings
//        str1.equals(str2);
//        System.out.println (str1==str2);// compare the adress
        //to compare address str1== str2;


    }
}
