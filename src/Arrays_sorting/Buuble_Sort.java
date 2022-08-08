package Arrays_sorting;

import java.util.Arrays;

public class Buuble_Sort {
    public static void main(String[] args) {
        int[] arr= {50,40,30,20,10};
        bubble_Sort(arr);

    }
    public static void bubble_Sort(int[] arr ){
        for(int count=1; count< arr.length;count++) {
            for (int s = 0; s <= arr.length - 2; s++) {
                if (arr[s] > arr[s + 1]) {
                    //                swap
                    int temp = arr[s];
                    arr[s] = arr[s + 1];
                    arr[s + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
