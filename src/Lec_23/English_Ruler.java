package Lec_23;

public class English_Ruler {
    public static void main(String[] args) {
//        ---0
//        -
//        --
//        -
//        ---1
//        -
//        --
//        -
//        ---2

        int length= 3;
        int majortick=3;
        ER(length,majortick);
//        printRuler(length);


    }
    public static void ER(int length, int major)
    {
        for(int i=0;i< length;i++)
        {
            for (int j=0;j<major;j++)
            {
                System.out.print("-");

            }
            System.out.println(i);
           printRuler(major-1);

        }
        for (int j=0;j<major;j++)
        {
            System.out.print("-");

        }
        System.out.println(length);
    }
    public static void printRuler(int n)
    {
//        BP: printRuler(n)
//        SP: printRuler(n-1)

//        base: P(0) ==return

        if(n==0)
        {
            return;
        }
        printRuler(n-1);
        for( int i=0; i<n;i++)
        {
            System.out.print("_");
        }
        System.out.println();
        printRuler(n-1);


    }
}
