package Lec8_Functions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        printArm(500);

    }

    private static void printArm(int i) {
        for (int j = 1; j <= i; j++) {
            if (isArm(j)) {
                System.out.println(j);
            }
        }
    }

    private static boolean isArm(int j) {
        int p = nod(j);
        int srm = 0;
        int n = j;
        while (n != 0) {
            int d = n % 10;
            srm = srm + (int) Math.pow(d, p);
            n = n / 10;

        }
        if (j == srm)
            return true;

        else
            return false;
    }

    public static int nod(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;

        }
        return count;
    }
}
