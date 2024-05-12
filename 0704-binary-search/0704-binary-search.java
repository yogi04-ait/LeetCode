class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums, target, 0, nums.length-1);
        
        
    }
    
    public int binarySearch(int[] nums,int target, int start, int end){
        
        int mid = start + (end-start)/2;
        
        if(start > end) return -1;
        
        if(nums[mid] == target){
            return mid;
        }
        
        
        
        if(nums[mid] > target){
           return binarySearch(nums, target, start, mid-1);
        }
        else{
           return binarySearch(nums, target, mid+1, end);

        }
        
        
    }
}