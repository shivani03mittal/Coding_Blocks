package Assignment1;

import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        char a = scn.next().charAt(0);
        boolean flag = true;

        while (flag) {
            char a = scn.next().charAt(0);
            if (a == '*' || a == '+' || a == '-' || a == '/' || a == '%') {
                int n1 = scn.nextInt();
                int n2 = scn.nextInt();
                int output = 0;


                switch (a) {
                    case '*':
                        output = n1 * n2;
                        flag = true;
                        break;

                    case '+':
                        output = n1 + n2;
                        flag = true;
                        break;

                    case '-':
                        output = n1 - n2;
                        flag = true;
                        break;

                    case '/':
                        output = n1 / n2;
                        flag = true;
                        break;

                    case '%':
                        output = n1 % n2;
                        flag = true;
                        break;

//                    case 'X':
//                        flag = false;
//                        break;
//
//
//                    case 'x':
//                        flag = false;
//                        break;

                }

                System.out.println(output);
            }

            else if(a =='X' || a=='x')
            {
                flag=false;
                break;
            }

            else
            {
                System.out.println("Invalid  operation. Try again.");
                flag= true;
            }
        }
    }
}
