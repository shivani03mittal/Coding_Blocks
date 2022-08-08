package Lec_26;

public class Subsequence {
    public static void main(String[] args) {
//        Subsequence for abc
        SubSeq("abc","");
        System.out.println("=========");

//        subsequence with ascii
        SubSeqASCII("abc","");
    }
    public static void SubSeq(String str, String ans)
    {
//        BP : subseq(str, "")
//        SP: subseq(str-char(0), ""/char(0))
//        base str is empty print



        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

//        Included
        SubSeq(str.substring(1), ans+ch);
//        excluded
        SubSeq(str.substring(1), ans);
    }

    public static void SubSeqASCII(String str, String ans)
    {
//        BP : subseq(str, "")
//        SP: subseq(str-char(0), ""/char(0),ascii)
//        base str is empty print



        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

//        Included
        SubSeqASCII(str.substring(1), ans+ch);
//        excluded
        SubSeqASCII(str.substring(1), ans);
//        Ascii
        SubSeqASCII(str.substring(1),ans+((int)ch));
    }
}
