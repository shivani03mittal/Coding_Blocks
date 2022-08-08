package Lec9_Arrays;

public class charArray {
    public static void main(String[] args) {
        char[] arr= new char[5];
//        System.out.println(arr);// won't print special something
        arr[0]='a';
        arr[1]='b';
        arr[2]='c';
        arr[3]='d';
//        arr[4]='e';
        System.out.println(arr[4]+ "="); //default value is space

        for(int i=0; i<arr.length;i++)
        {
            arr[i]= (char)('a'+i);
        }
//enhanced loops are read only , we can never make change into aray
        for(char ch: arr)
        {
            System.out.println(ch+",");
            ch='x';
        }
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ ",");
        }
        System.out.println("END");


    }
}
