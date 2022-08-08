package Arrays_BasicQues;

public class MaxElemetArray {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40};
        System.out.println(max(arr));


    }
    public static int max(int[] arr)
    {
        int max= Integer.MIN_VALUE;
        for (int i=0; i< arr.length;i++)
        {
            if( arr[i]> max)
                max= arr[i];
//            System.out.println(arr[i]);
        }
        return max;
    }
}
