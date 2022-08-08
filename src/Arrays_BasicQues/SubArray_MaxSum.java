package Arrays_BasicQues;

public class SubArray_MaxSum {

    public static void main(String[] args) {
//        kadane's algorithim
        int[] arr= {11,2,-3,8,5,-24,7,4,-11};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr)
    {
        int sum = 0;
        int maxSum=0;
        int start=0;
        int end=0;
        for(int i=0; i< arr.length;i++)
        {
            sum= sum+arr[i];
            if(sum <0)
            {
                sum =0;
//              start =i;
            }

            if(sum> maxSum)
            {
                maxSum= sum;
//               / end =i;
            }

            System.out.println("sum till indes "+i+"=> "+sum);

        }
        System.out.println("s and e"+ start+" "+ end);
        display(arr,start,end);
        return maxSum;
    }
    public static void display(int[] arr, int s, int e)
    {
        while (s<= e)
        {
            System.out.print(arr[s]+" ");
            s++;
        }

    }
}
//start index changes when sum=0
//end index when max sum;
