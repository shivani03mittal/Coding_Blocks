package Arrays_BasicQues;

import java.util.Scanner;

public class FindElemetinArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(find(arr, n));

    }

    public static int find(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }
}
