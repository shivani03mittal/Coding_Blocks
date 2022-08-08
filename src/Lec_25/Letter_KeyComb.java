package Lec_25;

import java.util.ArrayList;
import java.util.List;

public class Letter_KeyComb {
    public static void main(String[] args) {
        solve1("","");

    }
    public List<String> letterCombinations(String digits) {
     List<String> ans= new ArrayList<String>();
     solve(digits,"",ans);
     return ans;
    }

    public static void solve(String digits, String path, List<String> ans )
    {

        if(digits.isEmpty())
        {
//            System.out.println(path);
            ans.add(path);
            return;
        }
        char ch = digits.charAt(0);
        String options = map(ch);
        for(int i=0;i< options.length();i++)
        {
            char to_add= options.charAt(i);
            solve(digits.substring(1), path+to_add, ans);
        }
    }


    public static void solve1(String digits, String path)
    {

        if(digits.isEmpty())
        {
            System.out.println(path);
            return;
        }
        char ch = digits.charAt(0);
        String options = map(ch);
        for(int i=0;i< options.length();i++)
        {
            char to_add= options.charAt(i);
            solve1(digits.substring(1), path+to_add);
        }
    }

    public static String map(char ch) {
        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {
            return "def";
        } else if (ch == '4') {
            return "ghi";
        } else if (ch == '5') {
            return "jkl";
        } else if (ch == '6') {
            return "mno";
        } else if (ch == '7') {
            return "pqrs";
        } else if (ch == '8') {
            return "tuv";
        } else if (ch == '9') {
            return "wxyz";
        } else {
            return "";
        }

    }
}