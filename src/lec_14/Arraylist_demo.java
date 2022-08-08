package lec_14;

import java.util.ArrayList;

public class Arraylist_demo {
    public static void main(String[] args) {
        ArrayList <Integer> Al= new ArrayList<Integer>();
        System.out.println(Al); //prints the elements inside the arraylist

//        ArrayLists are appears to be dynamic version of Arrays
//        in <> brackets only give a class

        System.out.println(Al.size());

//        add element
        Al.add(10);
        Al.add(20);
        Al.add(30);
//        add function ADD AT  al.size() index, or at the end;
        System.out.println(Al);

        Integer T= null;  // its possible yo store null in heap/ non-primitive
        System.out.println(T);

//        int i=null;  we cannot becuse its a vlue;

//        add at an index
        Al.add(1,5);
        System.out.println(Al);

        Al.add(Al.size(),500);
        System.out.println(Al);

//        we can only add from (0 - arraylist.size); Range of Index

//        how to get info  at index i;
        System.out.println(Al.get(3)); //we can access till 0- arrlist.size-1;

//        update a value
        Al.set(2,99);
        System.out.println(Al);

//        Remove function
        System.out.println(Al.remove(1));
        System.out.println(Al);

        // can we use enhaved
        for(int i: Al)
        {
            System.out.print(i+" ");
        }

    }
}
