package Arrays_BasicQues;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int s=1;
        int e=n;
        int ans=n;

        while(s <= e)
        {
            int mid= (s+e)/2;
//            if(isBad(mid)){
//                ans= mid;
//                e= mid-1;
//            }
//            else
//            {
//                s= mid+1;
//            }
        }

    return ans;
    }
}
// s+e is making goinf out of range on int 2^31
// e+ (s-e)/2
//or s+ (e-s)/2