package Lec_32;

public class Queen_1d_2d {
    public static void main(String[] args) {
        queen1d(0,4,2,"");
        System.out.println("==========");
        queen2D(0,0,2,2,2,"");

    }
    public static void queen1d(int x,int total, int QTP, String ans)
    {
//        +ve base acse
        if(QTP ==0)
        {
            System.out.println(ans);
            return;
        }
//        -ve BC
        if(x==total)
        {
            return;
        }
//        two calls include and exclude

        queen1d(x+1,total,QTP-1,ans+"Q"+x);
        queen1d(x+1,total,QTP,ans);

    }

    public static void queen2D(int r, int c, int total_r, int total_c, int QTP, String ans)
    {
//        +ve base acse
        if(QTP ==0)
        {
            System.out.println(ans);
            return;
        }

//        moving algo
        if(c == total_c)
        {
            r++;
            c=0;

        }
//        -ve BC
        if(r == total_r)
        {
            return;
        }

//        two calls include and exclude

        queen2D(r,c+1,total_r,total_c,QTP-1,ans + "Q{" + r + "," + c + "}");
        queen2D(r,c+1,total_r,total_c,QTP,ans );
    }
}
