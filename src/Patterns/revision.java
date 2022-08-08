package Patterns;

public class revision {
    public static void main(String[] args) {
        int n =5;
        int row=1;
        int nst =1;
        while (row<=n)
        {
            int cst=1;
            while (cst<= nst){
                System.out.print("* ");
                cst++;
            }

            row++;
            nst++;
            System.out.println();
        }
    }
}
//*
//* *
//* * *
//* * * *
//* * * * *