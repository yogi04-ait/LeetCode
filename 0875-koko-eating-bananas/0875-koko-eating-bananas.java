class Solution {
    
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        
        for(int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(numberofhours(piles, mid) <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
    
    public int numberofhours(int[] piles, int hours) {
        int count = 0;
        for(int i = 0; i < piles.length; i++) {
            count += Math.ceil((double)piles[i] / hours);
        }
        return count;
    }
}
