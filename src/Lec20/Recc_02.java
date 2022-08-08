package Lec20;

public class Recc_02 {
    public static void main(String[] args) {
//        n!(Factoria;);
//        exponent(x^n);
//        fibbonacii;

        System.out.println(Fact(5));
        System.out.println("---------------------------------");
        System.out.println(Powe(2,10));
        System.out.println("---------------------------------");
        System.out.println(Fib(6));

    }

    public static int Fact(int n) {

//        BP: fact(n)
//        SP: fact(n-1)
//        creation= n*fact(n-1)
//        base: zero return

        if(n==1)
        {
            return n ;
        }

        int ans= n* Fact(n-1);
//        System.out.println(ans);
        return ans;
    }

    public static int Powe(int x, int n)
    {
//        BP: x*x*x*x...ntime
//        SP: x*x*x*x...n-1 times
//        base n=0 return 1;

        if(n==0)
        {
            return 1;
        }

        int ans= x * Powe(x, n-1);
        return ans;
    }

    public static int Fib(int n)
    {
//        BP: Fib(n);
//        SP: Fib(n-1)+Fib(n-2)
//        base: Fib(0) and Fib(1)==n(0,1)

        if(n<=1)
        {
            return n;
        }

        int sp1= Fib(n-1);
        int sp2= Fib(n-2);
        return sp1+sp2;
    }
}
