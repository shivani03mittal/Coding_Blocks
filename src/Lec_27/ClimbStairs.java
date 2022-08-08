package Lec_27;

public class ClimbStairs {
    static int count=0;
    public static void main(String[] args) {
        climb(0,"",4);
        System.out.println(count);

    }

    public static void climb(int curr, String path, int dest)
    {


//        Bp: climb(0 to dest)
//        sp: climb 1step, 2 step to dest
//        base curr == dest
//        -ve base curr > des

        if(curr == dest)
        {
            System.out.println(path);
            count++;
            return;
        }

        if(curr > dest)
        {
            return;
        }

        climb(curr+1, path+1, dest);
        climb(curr+2, path+2, dest);
    }
}
