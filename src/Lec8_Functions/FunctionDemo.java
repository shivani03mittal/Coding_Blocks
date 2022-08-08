package Lec8_Functions;

public class FunctionDemo {
    public static void main(String[] args) {
        name();
        name2(5,3);
    }

    public static void name(){
        System.out.println("name: JK");
//        a function , void return type, zero arguments, zero inputs.
    }

    public static void name2(int a, int b){
        System.out.println("name 2: ran");
        System.out.println(a+b);

//        2 input arguments a,b.
    }

    public static int add(int a, int b){
        return a+b;
    }
}
