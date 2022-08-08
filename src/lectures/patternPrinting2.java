package lectures;

public class patternPrinting2 {
    public static void main(String[] args) {
        int n = 5;

        int row = 1;

        int nst = 1;

        while (row <= n) {
            int cst = 1;

            while (cst <= nst) {
                System.out.print("* ");
                cst++;

            }
//        prep section for next row
            row++;
            System.out.println();
            nst++;
        }


    }
}
