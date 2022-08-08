package Assignment2_Arrays;

import java.util.Scanner;

public class TargetSumPairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        if (N > 1 && N < 1000) {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scn.nextInt();
            }

            int target = scn.nextInt();
            sort(arr);
            SumTarget(arr, N, target);
        }


    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int count = 1; count < n; count++) {
            for (int i = 0; i <= n - 2; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void SumTarget(int[] arr, int n, int t) {
        for (int i = 0; i < n; i++) {
            int req = t - arr[i];
            for (int j = i+1; j < n; j++) {
                if (arr[j] == req) {
//                    if(arr[i]>arr[j])
//                        System.out.println(arr[j]+" and "+arr[i]);
//
//                    else
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
