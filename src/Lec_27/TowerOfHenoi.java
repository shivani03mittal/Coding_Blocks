package Lec_27;

public class TowerOfHenoi {
    public static void main(String[] args) {
        TOH(3,'A','C','B');

    }

    public static void TOH(int n, char src, char dest,char help )
    {

//        Bp to move n disks from a to c using helper
//        sp is to move n-1 disks from src to helper using dest as helper

        if(n== 0)
        {
            return;
        }
        TOH(n-1,src,help,dest);
//        move nth disk to src
        System.out.println("move disk "+n+" form "+src+" to "+dest);
//        move n-1 disk from helper to dest
        TOH(n-1, help,dest,src);
    }
}
