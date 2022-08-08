package Arrays_BasicQues;

public class Subaarays {
    public static void main(String[] args) {

        int[] arr= {10,20,30,40,50};
        for(int i=0;i< arr.length;i++)
        {
            int sum=0;
            for(int j=i;j< arr.length;j++)
            {

//                for(int ll= i;ll<=j;ll++)
//                {
//                    sum= sum+ arr[ll];
//                }

                sum= sum+arr[j];
                display(arr,i,j);
                System.out.println("===>"+ sum);
            }
        }

    }
    public static void display(int[] arr, int s, int e)
    {
        while (s<= e)
        {
            System.out.print(arr[s]+" ");
            s++;
        }

    }

//    public static void sumSub(int []arr)
//    {
//
//    }
}
//        for a n length array
//        total sub arrays= n(n-1)/2
