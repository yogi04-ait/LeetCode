class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while(start <= end){
            long mid = start + (end-start)/2;
            long cRows = (mid *(mid+1))/2;
            if(cRows <= n){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }

        return (int)end;
    }
}