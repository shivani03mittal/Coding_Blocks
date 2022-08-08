package Lectures2;

public class FtoC {
    public static void main(String[] args) {
        int minF=0;
        int maxF=100;
        int step=20;

        for(int F=minF; F<= maxF; F=F+step)
        {
            int C = 5*(F-32)/9;
//            int C= (int) (5/ 9.0*(F-32));
            System.out.println(F +"\t"+C);

        }
    }
}
//one catch is that 5/9 is zero hence we need to make them float or double
//or first multiply and then devide.