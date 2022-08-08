package Assignment2_Arrays;

import java.util.Scanner;

public class TrappingRainWater {

        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            for(int t=1;t<=T;t++)
            {
                int N = scn.nextInt();
                int[] arr= new int[N];
                for(int i=0;i<N;i++)
                {
                    arr[i] = scn.nextInt();
                }
                System.out.println( trappring(N, arr));
            }
            // two approches : take 3 arrays of n length store leftmax,rightmax,minLR
            // two pointr apporach


        }

        public static int trappring(int N, int[] arr)
        {
            int left=0;
            int right= N-1;
            int leftmax= arr[left];
            int rightmax= arr[right];
            int total =0;
            while(left < right)
            {
                if(leftmax <= rightmax)
                {
                    left++;
                    int dif = leftmax- arr[left];
                    if(dif>0)
                        total += dif;
                    else
                        leftmax= arr[left];
                }
                else{
                    right--;
                    int dif = rightmax- arr[right];
                    if(dif>0)
                        total += dif;
                    else
                        rightmax= arr[right];
                }
            }

            return total;
        }
    }


