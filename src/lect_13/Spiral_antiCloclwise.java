package lect_13;

public class Spiral_antiCloclwise {
    public static void main(String[] args) {
        int[][] mat ={{11, 12, 13}, {21, 22, 23}, {31, 32, 33}, {41, 42, 43},{51,52,53}};
        sprial(mat);

    }
    public static void sprial(int[][] arr)
    {
        int rs=0;
        int re= arr.length -1;
        int cs= 0;
        int ce= arr[0].length-1;
        int count=0, limit= arr.length*arr[0].length;
        while(rs <=re && cs<= ce) {

            for (int r = rs; r <= re && count< limit; r++  ) {
                System.out.print(arr[r][cs] + " ");
                count++;
            }
            System.out.println();
            for (int c = cs + 1; c <= ce && count< limit; c++) {
                System.out.print(arr[re][c] + " ");
                count++;
            }
            System.out.println();
            for (int r = re - 1; r >= rs && count< limit; r--) {
                System.out.print(arr[r][ce] + " ");
                count++;
            }
            System.out.println();
            for (int c = ce - 1; c >= cs + 1 && count< limit; c--) {
                System.out.print(arr[rs][c] + " ");
                count++;
            }
            System.out.println();
            rs++;
            re--;
            cs++;
            ce--;
        }
    }
}
