package lectures;

public class Fibonnacci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int count=1;
        while(count<=n)
        {
            int c=a+b;
            System.out.println(a);
//            if c is printed we start from 1(3rd pos)
//            if b is printed then we print 1 (2nd pos)
//            if a is printed then we starts from 0.
            a=b;
            b=c;
            count++;

        }
        System.out.println("nth"+a);

    }
}
