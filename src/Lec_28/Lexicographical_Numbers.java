package Lec_28;

public class Lexicographical_Numbers {
    public static void main(String[] args) {

//        lexco(1,100);
//            for (int i=1;i<=9;i++)
//            {
//                lexco(i,100);
//            }

        lexco(0,100);
    }

    public  static void lexco(int n, int limit)
    {
//        bp each number creates 10 frmaes(0=9)
//        but 0 will also call infinite times 100 so to avoid cfreate a case

        if(n >limit)
        {
            return;
        }
        System.out.println(n);
        int i=0;
        if(n==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            lexco(n*10+i,limit);
        }
    }
}
