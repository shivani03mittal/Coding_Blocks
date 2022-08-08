package Arrays_sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,25};
//        int[] arr={50,40,30,20,10};
        insertion_sort(arr);
    }
    public static void insertion_sort(int[] arr){
//        insert an element of a sorted array
//        int to_insert= arr.length-1;
        int to_insert =1;
        while (to_insert <arr.length) {


            int val = arr[to_insert];
            //        int val= 40;
            int idx = to_insert - 1;
            while (idx >= 0 && arr[idx] > val) {
                //            shift to right
                arr[idx + 1] = arr[idx];
                idx--;
            }
            System.out.println(Arrays.toString(arr));
            //        insert at idx+1;
            arr[idx + 1] = val;
            System.out.println("Insert="+Arrays.toString(arr));

            to_insert++;
        }
    }


}
