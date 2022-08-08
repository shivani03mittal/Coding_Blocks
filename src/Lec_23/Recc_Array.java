package Lec_23;

import java.util.Arrays;

public class Recc_Array {
    //    Max element in array
//    printing array
//    MIn element
//    print reverse
//    return first Occurance
//    return last ocurance
//    return arr of all occ of an element
    public static void main(String[] args) {
        int[] arr = {99, 1, 24, 305, 34, 2};
        System.out.println(Max(arr, 0));
        System.out.println("-----------------------");
        Print(arr,0);
        System.out.println("-----------------------");
        System.out.println(Min(arr, 0));
        System.out.println("-----------------------");
        PrintRev(arr, arr.length-1);
        System.out.println("-----------------------");
        int[] arr1 = {9,10, 1, 4,10,10, 305, 34,10, 2};
        System.out.println(FirstOcc(arr1, 0,10 ));
        System.out.println("-----------------------");
        System.out.println(LastOcc(arr1, 0,10 ));
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(ALLOcc(arr1, 10,0,0 )));

    }



    public static int Max(int[] arr, int idx) {
//    BP: Max(arr,0)
//    SP: Max(ar,1)
//    base: ind== last the return element

        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int sp = Max(arr, idx + 1);

        return Math.max(arr[idx], sp);
    }


    public static void Print(int[] arr, int idx)
    {
        //    BP: Print(arr,0)
//    SP: Print(ar,1)
//    base: ind== last+1; the return element

        if(idx == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        Print(arr, idx+1);
    }
    public static int Min(int[] arr, int idx) {
//    BP: Min(arr,0)
//    SP: Min(ar,1)
//    base: ind== last the return element

        if(idx == arr.length-1)
        {
            return arr[idx];
        }
        int sp = Min(arr,idx+1);
        return Math.min(sp, arr[idx]);
    }

    public static void PrintRev(int[] arr, int idx)
    {
        //    BP: Print(arr,arr.length to 0)
//    SP: Print(ar,arr.length to 1)
//    base:

        if(idx<0 )
        {
            return;
        }
        System.out.println(arr[idx]);
        PrintRev(arr, idx- 1);
    }

    public static int FirstOcc(int[] arr, int idx, int ali){
//        BP : first occ[0,ali]
//        SP: first occ[1,ali]
//        bse: ind== arr.length: return -1


        if(idx == arr.length)
        {
            return -1;
        }


        int sp = FirstOcc(arr, idx+1,ali);
        if(arr[idx] == ali)
        {
            return idx;
        }
        else {
            return sp;
        }
    }

    public static int LastOcc(int[] arr, int idx, int ali)
    {
//        BP: LO[arr,0,ali}
//        SP:LO{arr,1,ali]
//        base: inx== arr.length return -1

        if(idx== arr.length)
        {
            return -1;
        }

        int sp = LastOcc(arr,idx+1,ali);
        if(arr[idx] ==ali && sp ==-1)
        {
            return idx;
        }
        else {
            return sp;
        }

    }


    public static int[] ALLOcc(int[] arr, int ali, int idx, int coun)
    {
//        BP: alloc[arr,ali,0,0]
//        SP: alloc[arr,ali,1,0] /[arr,ali,1,1]
//        base: idx == length return my arr;
        if(idx== arr.length)
        {
            return new int[coun];
        }

        if(arr[idx]== ali)
        {
            int[] sp= ALLOcc(arr,ali,idx+1,coun+1);
            sp[coun]= idx;
            return sp;
        }
        else {
            int[] sp= ALLOcc(arr,ali,idx+1,coun);
            return sp;
        }
    }

}
