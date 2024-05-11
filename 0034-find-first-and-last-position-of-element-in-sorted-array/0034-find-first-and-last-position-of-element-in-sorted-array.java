class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int rightIndex = -1;
        int leftIndex = findIndex(nums, target, true);
        if(leftIndex != -1){
            rightIndex = findIndex(nums, target, false);
        }
        
        
        return new int[] {leftIndex, rightIndex};
        
        
    }
    
    
     public int findIndex(int[] arr, int target, boolean leftIndex){
         
         int index = -1;
         int start = 0;
         int end = arr.length-1;
         
         while(start <= end){
             int mid = start + (end-start)/2;
             
             if(target == arr[mid]){
                 
                 index = mid;
                 if(leftIndex){
                     end = mid-1;
                 }else{
                     start = mid+1;
                 }
                 
             }
             
             else if(target < arr[mid]){
                 end = mid-1;
             }else{
                 start = mid+1;
             }
         }
         
         return index;
     }
}