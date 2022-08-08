package Arrays_BasicQues;

public class Binarysearch {
    public static void main(String[] args) {
        int[] sorted={5,7,11,12,15,20,31,33,35,40,45,55,58,66,71};
        System.out.println(BinarySearch(sorted,42));
    }

    public static int BinarySearch(int[] arr, int boda){
        int s=0;
        int e= arr.length;
        while (s<=e)
        {
            int mid= (s+e)/2;
            System.out.println(s+","+arr[mid]+","+e+" === "+boda);
            if(arr[mid] == boda){
                return mid;
            }
            else if(arr[mid] < boda){
                s= mid+1;
            }
            else {
                e= mid -1;
            }
        }
        return -1;
    }
}
//total numver of comparisions in binary are = log n (bse2)+1