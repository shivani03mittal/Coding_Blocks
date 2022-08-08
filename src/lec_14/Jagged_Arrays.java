package lec_14;

public class Jagged_Arrays {
    public static void main(String[] args) {
        int[][] mat= new int[3][0];
//        3 rows 0cols

        for(int[] row: mat)
        {
            System.out.println(row);
            System.out.println(row.length);
        }
//        can we make jagged array
        mat[0] = new int[5];
        mat[2]= new int[15];
        System.out.println("=============");
        for(int[] row: mat)
        {
            System.out.println(row);
            System.out.println(row.length);
        }

//        tp print
//        for first loop till element of eac row
//        no of col from 0 to length of each row
    }
}
