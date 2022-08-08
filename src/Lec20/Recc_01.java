package Lec20;

public class Recc_01 {
    public static void main(String[] args) {
//        print decreasing
//        print increasing
//        print decInc;
//        print IncDec;

        		PD(4);
        System.out.println("===============================");
        PI(4);
        System.out.println("===============================");
        PDI(5);
        System.out.println("===============================");
        PID(1,10);
    }



    public static void PD(int n) {
        if (n == 0) {
//			Smallest problem!! used to stop further division of PD(o)
//			Base case!!
            return;
        }
//		BP : PD(n)
//		SP : PD(n-1)

        System.out.println(n);
        PD(n - 1);

    }

    public static void PI(int n) {
        if(n==1) {
            System.out.println(1);
            return;
        }
//		BP : PI(n)
//		SP : PI(n-1)

        PI(n - 1);
        System.out.println(n);
    }

    public static void PDI(int n) {

        if(n==0){
            return;
        }

//        BP =PDI(n)
//        SP= PDI(n-1)

        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }

    public static void PID(int n, int limit) {

//        BP :PID(1)
//        smaller: PID(2to limit)
//        base :PID(limit +1)
        if(n== limit+1)
        {
            return;
        }
        System.out.println(n);
        PID(n+1,limit);
        System.out.println(n);
    }


}
