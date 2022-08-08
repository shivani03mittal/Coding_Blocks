package Assignment1;

import java.util.Scanner;

public class Anybase_to_Anybase_conv {


        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int sbase= scn.nextInt();
            int dbase= scn.nextInt();
            int n= scn.nextInt();

            int answer=0;
            int m=1;
            if(sbase == 10 || dbase==10)
            {
                while(n!=0){
                    int digit= n%dbase;
                    answer= answer+(digit*m);
                    n= n/dbase;
                    m= m* sbase;
                }

            }
            else{
                int sbase2=10;
                // sbase to sbase2;
                while(n!=0){
                    int digit= n%sbase2;
                    answer= answer+(digit*m);
                    n= n/sbase2;
                    m= m* sbase;
                }

                // sbase2 to dbase
                n= answer;
                answer=0;
                m=1;
                while(n!=0){
                    int digit= n%dbase;
                    answer= answer+(digit*m);
                    n= n/dbase;
                    m= m* sbase2;
                }
            }

            System.out.print(answer);

        }

}
