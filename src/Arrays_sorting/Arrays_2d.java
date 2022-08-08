package Arrays_sorting;

public class Arrays_2d {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(arr);

        int [][] mat = new int[3][5];
        int[][][] mat3= new int[3][5][3];

//        size of rows
        System.out.println(mat.length);

//        size of column
        System.out.println(mat[0].length);
        System.out.println(mat[1].length);
        System.out.println(mat[2].length);
        dis(mat);
    }

    public static void dis(int[][] mat)
    {
        for(int r=0; r< mat.length;r++)
        {
            for (int c=0; c< mat[r].length;c++)
            {
                System.out.print(mat[r][c]+" ");

            }
            System.out.println();

            for(int[] row : mat)
            {
                for(int ele : row){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        }
    }
}
