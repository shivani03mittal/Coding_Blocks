package lect_13;

public class Search_2D {
    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 28, 37, 48}, {29, 33, 39, 50}};
        int r = 0;
        int c = mat[0].length - 1;
        int ali = 29;

        while (r < mat.length && c >= 0) {
            System.out.println(mat[r][c] + "_" + ali);
            if (mat[r][c] == ali) {
                System.out.println("found it");
                break;
            } else if (mat[r][c] < ali) {
                r++;
            } else {
                c--;
            }
        }
        System.out.println("NOt found");
    }
}
