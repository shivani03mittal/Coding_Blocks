package Lec_25;

import java.util.ArrayList;
import java.util.List;

public class GenerateParathese {
    public static void main(String[] args) {
//        Generate parantheeses- letcode

        Generate1(3,3,"");

    }

    public static List<String> generateParenthesis(int n){
        List<String > ans = new ArrayList<String>();
        Generate(n,n,"",ans);
        return ans;
    }
    public static void Generate1(int open, int close, String path)
    {
//        BP: genaerate(3,3,"")
//        SP: genrate(2,3,"(")
//        bse case: open==0, open ==close

        if(open==0 && open ==close)
        {
            System.out.println(path);
            return;
        }

//        -ve base case
        if(open>close)
        {
//            this means started with close
            return;
        }
        if(open>0)
            Generate1(open-1,close,path+"(");
        if(close>0)
            Generate1(open,close-1, path+")");
    }

    public static void Generate(int open, int close, String path, List<String> ans)
    {
//        BP: genaerate(3,3,"")
//        SP: genrate(2,3,"(")
//        bse case: open==0, open ==close

        if(open==0 && open ==close)
        {
//            System.out.println(path);
            ans.add(path);
            return;
        }

//        -ve base case
        if(open>close)
        {
//            this means started with close
            return;
        }
        if(open>0)
        Generate(open-1,close,path+"(", ans);
        if(close>0)
        Generate(open,close-1, path+")", ans);
    }
}
