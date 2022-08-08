package Lec20;

public class StringDemo {
    public static void main(String[] args) {
        String str00= "the"; //literal method of string creation
        String str01= "the";
        String str02= "the";
        String str03= "the";

        String str04= "the";

        str01 =str01+ "op";
        System.out.println(str01 == str00); // immutability!! changes are created at a new address!!
        System.out.println(str00);
        System.out.println(str01);

        //		String str111 = new String ("the");  // method using new
    }
}
