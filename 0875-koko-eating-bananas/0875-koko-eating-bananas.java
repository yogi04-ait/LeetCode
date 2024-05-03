class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[0];
        
        for (int i = 0; i < piles.length; i++) {
            if (end < piles[i]) {
                end = piles[i];
            }
        }
                
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            
            for (int i = 0; i < piles.length; i++) {
                count += Math.ceil((double)piles[i] / mid);
            }
            
            if (count <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
}
