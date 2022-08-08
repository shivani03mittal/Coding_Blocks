package lec_14;

public class wrapper_classes {
    public static void main(String[] args) {
//        each primitive has its warpper classes
//        wraper is given memory in heap

        byte c=1 ;//stored in fnc frame
        Byte b = 1; // stored in heap

        short s= 10;
        Short S= 10;

        int i=10;
        Integer I = 20;

        long l= 10;
        Long L= 200L;

        char ch = 'i';
        Character CH= '2';

        System.out.println(i);
        System.out.println(I);
//        wrapper : when you print object of a wrapper class, they behave
//        just like primitive versions.

//        why need wrapper: becoz later data structure like, arraylist, linklist, stack, queues, graphs, trees.
//        they are created using the non-primitive data types
//        this is one limitation of java that later DS can not be created through primitive.

//      What's happening
        i= I;
//        we went in heap, address of I pull out value, stores in i
//        THIS CONCEPT IS CALLED UNBOXING.
        System.out.println(i);


        I =i;
        System.out.println(I);
//        boxing, auto boxing // automatically puts value into heap memory;
    }
}
