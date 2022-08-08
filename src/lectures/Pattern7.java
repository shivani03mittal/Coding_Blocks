package lectures;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        int row=1;

        int nst=5;
        while (row <=n )
        {
//            oprint star
            int cst=1;
            while (cst<=nst)
            {
                if(row==1 || row==n  || cst==1 || cst==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

                cst++;
            }
            System.out.println();
            row++;
        }
    }
}
//* * * * *
//*       *
//*       *
//*       *
//* * * * *