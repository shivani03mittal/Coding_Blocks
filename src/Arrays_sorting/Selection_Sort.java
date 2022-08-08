package Arrays_sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {

//        Selection sort always sorts in minimum swapps
        int[] arr={ 50,40,30,20,10};
        selection_sort(arr);
    }

    public static void selection_sort(int[] arr){
//        finds max element at put at last
        int last= arr.length-1;

        while (last >0) {
            int max_idx = 0;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > arr[max_idx]) {

                    max_idx = i;
                }
            }
            //                swap
            if(max_idx != last) {
                System.out.println(max_idx + " swaping " + last);
                int temp = arr[max_idx];
                arr[max_idx] = arr[last];
                arr[last] = temp;
            }
            System.out.println(Arrays.toString(arr));
//update last
            last--;
        }
    }
}
