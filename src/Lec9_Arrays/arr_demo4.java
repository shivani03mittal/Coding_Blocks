package Lec9_Arrays;

public class arr_demo4 {
    public static void main(String[] args) {
        int[] arr1= {10,20,30,40};
        int[] arr2= {1,2,3,4};
//        swap(arr1,arr2);
        swap_in(arr1,arr2,3);
        for(int i:arr1)
        {
            System.out.print(i+" "); //direct access to element no need to index
        }
        System.out.println();

        for(int i:arr2)
        {
            System.out.print(i+" "); //direct access to element no need to index
        }
        System.out.println();
    }

    public static void swap(int[] arr1, int[] arr2)
    {
        int[] temp= arr1;
        arr1= arr2;
        arr2= temp;

//        would not swap because arr1, arr2 are local variables ;
    }

    public static void swap_in(int[] a, int[] b, int c)
    {
        int s= a[c];
        a[c]= b[c];
        b[c]=s;
//        would not swap because arr1, arr2 are local variables ;
    }
}

//in jav we parse non-primitive datatype(array) as address
//primitive datatype as values