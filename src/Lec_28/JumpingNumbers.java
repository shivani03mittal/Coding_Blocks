package Lec_28;

public class JumpingNumbers {
    public static void main(String[] args) {

//        jumping(1,105);

        for(int i=1;i<=9;i++)
        {
            jumping(i,105);
            System.out.println("=======");
        }
    }

    public static void jumping(int n, int limit)
    {
        if(n>limit)
        {
            return;
        }
        int digit= n%10;

        System.out.println(n);
        if(digit>0)
        jumping(n*10+digit-1,limit);

        if(digit<9)
        jumping(n*10+ digit+1, limit);
    }
}
