class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int count = 1;
        int index = 0;
        
        while(index < arr.length && k > 0){
            
            if(arr[index] != count){
                k--;
            }else{
                index++;
            }
            
            if(k == 0){
                return count;
            }
            
            count++;
        }
        
        if(k > 0){
            return (count+k-1);
        }
        
        return count-1;
        
    }
}