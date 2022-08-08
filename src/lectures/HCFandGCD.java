package lectures;

public class HCFandGCD {
    public static void main(String[] args) {
//use euclid's method
//        as soon as remainder is 0 that divisor is HCF (long tree division)

        int n1 = 18,n2 = 30;
        int divisor, divident;
        if(n1>n2){
            divident = n1;
            divisor = n2;
        }
        else {
            divident = n2;
            divisor = n1;
        }


        while (divisor!=0)
        {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;

        }
        System.out.println(divident);
    }
}
//LCM = a*b/ HCF