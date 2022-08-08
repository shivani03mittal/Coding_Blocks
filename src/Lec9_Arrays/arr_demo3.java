package Lec9_Arrays;

public class arr_demo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i= 0; i< arr.length;i++)
        {
            arr[i]= 10* (i+1);
        }

        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        int[] other = arr;// not creating other array just storing the address of ar in it.
        System.out.println(other);
        System.out.println(arr);

        other[1]=99; // also chnages value at arr[1];
        System.out.println(arr[1]);


//        copy of array > create a new arr of same size> cop each elemeny by element.

    }
}
