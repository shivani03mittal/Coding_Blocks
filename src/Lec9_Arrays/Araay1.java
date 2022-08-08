package Lec9_Arrays;

public class Araay1 {
    public static void main(String[] args) {
        int a1=1;
        int[] arr = new int[10];// array of 10 integers hardcoded
        System.out.println(arr); // print address of the array
//        size of array
        System.out.println(arr.length);

//        indexing
        System.out.println(arr[0]);
//        value of last element
        System.out.println(arr[arr.length -1]);

//        printing array
        for(int i=0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

//        System.out.println(arr[10]); // index range out of bound excetion
//        its a runtime error

//        enhanced loop / for each loop
//        looping without index
        for(int i: arr)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//
    }
}
