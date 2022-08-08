package Lec8_Functions;

public class Func3 {
    static int global = 234;
    public static void main(String[] args) {
        int a=1;
        int b=20;

        System.out.println(a +" : "+b);
        swap(a,b);
        System.out.println(a +" : "+b);
        System.out.println(global);
    }

    public static void swap(int a, int b)
    {
        System.out.println(a +" : "+b);
        global++;
        int c=a;
        a=b;
        b=c;
        System.out.println(a +" : "+b);
    }
}
//chnages that happens in one function frame to the local once it won't
//be reflected on the global ones.

//if we want to change that too then create global variables.
//global variables ae stored in heap memories.

//if same varable as global and local then local is priortized
//if want to access global over local then use **Classname.varable**
