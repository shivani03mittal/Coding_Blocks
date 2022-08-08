package Lec_31;

public class PermutationandComb {
    public static void main(String[] args) {
        int total =4;
        boolean[] selected = new boolean[total];
        perm(total,2,"",selected);
        System.out.println("============");
        comb(4,2,"",-1);


    }

    public static void perm(int total, int to_select, String path, boolean[] selected)

    {
//        arrangement matters
//        b1b0 != b0b1
//        base case: toselect=0;
        if(to_select==0)
        {
            System.out.println(path);
            return;
        }
        for(int i=0;i< total;i++) {
//            select
            if (selected[i] == false) {
                selected[i] = true; //prep
                perm(total, to_select - 1, path + "b" + i, selected);
                selected[i] = false; //backtrack
            }
        }
    }

    public static void comb(int total, int toselect, String path, int lastbox)
    {
//        arrangement does not matter
//        therefore b1b0 is same as b0b1
        if(toselect==0)
        {
            System.out.println(path);
            return;
        }
        for(int i= lastbox+1; i<total;i++)
        {
            comb(total, toselect-1, path+"b"+i,i);
        }
    }

    public static void comb_wrt_box(int Curr, int toSelect, int total, String ans) {
        if (toSelect == 0) {
            System.out.println(ans);
            return;// +ve BC
        }
        if (Curr == total) {
            return; // -ve BC
        }

        comb_wrt_box(Curr + 1, toSelect - 1, total, ans + "b" + Curr);
        comb_wrt_box(Curr + 1, toSelect, total, ans);

    }
}
