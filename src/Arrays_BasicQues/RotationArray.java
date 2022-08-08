package Arrays_BasicQues;

public class RotationArray {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        int rot=-1;
        rotation(arr, rot);
        diaply(arr);
        roat2(arr, rot);
        diaply(arr);

    }
    public static void rotation(int[] arr, int rot)
    {
        rot= rot% arr.length;
        if(rot<0)
            rot= rot+ arr.length;
        for(int r=1;r <=rot;r++)
        {
            int last= arr[arr.length -1];
            for(int i= arr.length-2 ;i >=0;i--)
            {
                arr[i+1]= arr[i];
            }
            arr[0]= last;

        }

    }

    public static void roat2(int []arr, int rot)
    {rot= rot% arr.length;
        if(rot<0)
            rot= rot+ arr.length;


//        step1: Divide the body into 2 parts , body and cap and then
//        reverse boyy
        rev2(arr,0,arr.length-1-rot);
//        reverse the cap
        rev2(arr, arr.length-1-rot,arr.length-1);
//        step2: rotate/rev whole array
        rev2(arr,0,arr.length-1);
    }
    public static void rev2(int[] arr, int s, int e)
    {
        int start=s;
        int end= e;

        while (start < end)
        {
//            swap
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end --;
        }

    }
    public static void diaply(int[] arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
