package lectures;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;

        int nst = n;
        int nsp = 0;
        while (row <= 2 * n - 1) {
//            print space
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
//            print star
            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }

            row++;
            System.out.println();
            if (row > n) {
                nst++;
                nsp = nsp - 2;
            } else {
                nst--;
                nsp = nsp + 2;
            }
        }
    }
}
