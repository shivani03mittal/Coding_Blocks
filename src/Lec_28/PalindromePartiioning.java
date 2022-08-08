package Lec_28;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartiioning {
    public static void main(String[] args) {
        List<String> part_al = new ArrayList<>();
        partion("nitin","", part_al);

    }

    public static void partion(String str, String parts, List<String> part_al)
    {
//        BP: partioning n length string
//        sp: part of remaining length string
        if(str.isEmpty())
        {
            System.out.println(parts+ "=>"+ part_al);
        }
        for(int i=1;i <=str.length();i++)
        {

            String chopedstr= str.substring(0,i);
            if(isPalin(chopedstr)) {
                String remainingstr = str.substring(i);
//            System.out.println(chopedstr+" || "+ remainingstr);
//            till now we have pafrtioned the initla string
//            now parts of remaing parts

//            add only tasty parts

                part_al.add(chopedstr);
                partion(remainingstr, parts + chopedstr + " ", part_al);
//            all partioning done now plaindrome
//            backtracking explicitly
                part_al.remove(part_al.size() - 1);
            }
        }
    }

    public static boolean isPalin(String str)
    {
        int s=0;
        int e = str.length()-1;
        while (s<e)
        {
            if(str.charAt(s) != str.charAt(e))
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}

//class Solution {
//    public List<List<String>> partition(String s) {
//       // List<List<String>> part_al= new ArrayList<ArrayList<String>>();
//        List<String> part_al= new ArrayList<>();
//       List<List<String>> part = new ArrayList<>();
//        partition(s,part_al,part);
//
//        return  part;
//    }
//
//    public static void partition(String str,List<String> part_al,List<List<String>> part )
//    {
//         if(str.isEmpty())
//        {
//            System.out.println( part_al);
//            part.add(new ArrayList(part_al));
//        }
//
//         for(int i=1;i <=str.length();i++)
//        {
//
//            String chopedstr= str.substring(0,i);
//            if(isPalin(chopedstr)) {
//                String remainingstr = str.substring(i);
//
//                 part_al.add(chopedstr);
//                partition(remainingstr, part_al, part);
////            all partioning done now plaindrome
////            backtracking explicitly
//                part_al.remove(part_al.size() - 1);
//            }
//
//        }
//    }
//
//    public static boolean isPalin(String str)
//    {
//        int s=0;
//        int e = str.length()-1;
//        while (s<e)
//        {
//            if(str.charAt(s) != str.charAt(e))
//            {
//                return false;
//            }
//            s++;
//            e--;
//        }
//        return true;
//    }
//}