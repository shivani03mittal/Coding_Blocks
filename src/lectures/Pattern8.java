package lectures;

public class Pattern8 {
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

                if(row== cst || row+cst==n+1)
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
//*       *
//  *   *
//    *
//  *   *
//*       *
