package Lec_26;

public class CoinToss {
    public static void main(String[] args) {
//        toss coin
        Toss(3,"");

        System.out.println("======================");
//        toss coin without 2 consecutive Ts;
//        TossCond(3,"");
        TossCond(3,"",false);
    }

    public static void Toss(int n, String ans)
    {
//        BP: toss(n, "")
//        SP: toss(n-1,H/T)
//        base: toss 0: print ans
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

//        Case1: when head tossed
        Toss(n-1,ans+"H");

//        Case2: when tail tossed
        Toss(n-1,ans+"T");
    }

    public static void TossCond(int n, String ans, boolean last_T)
    {
//        BP: toss(n, "")
//        SP: toss(n-1,H/T)
//        base: toss 0: print ans
        if(n==0)
        {
//            if(ans.indexOf("TT") == -1)
            {
                System.out.println(ans);
            }

            return;
        }

//        Case1: when head tossed
        TossCond(n-1,ans+"H",false);

//        Case2: when tail tossed
        if(last_T == false)
        TossCond(n-1,ans+"T",true);
    }

}
