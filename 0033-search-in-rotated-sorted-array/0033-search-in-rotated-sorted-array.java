class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = pivot(nums);
        
        
         if(pivot == -1){
            return binarySearch(nums, 0, nums.length-1 , target);

        }
        
        
        
        if(nums[pivot] == target){
            return pivot;
        }
        
       
        
        
        if(target >= nums[0]){
           return binarySearch(nums, 0, pivot-1, target);
        }
        else{
            return binarySearch(nums, pivot+1, nums.length-1, target);
            
        }
        
        
        
        
    }
    
    public int binarySearch(int[] nums,int s, int e, int target){
        
        
        while(s <= e){
            
            int mid = s+(e-s)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]> target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        
        return -1;
    }
    
    
    public int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        
        while(start <=end){
            int mid = start + (end-start)/2;
            
            if(mid < nums.length-1 &&  nums[mid]>nums[mid+1]){
                return mid;
            }
            
            if(mid > 0 && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            
            if(nums[start] < nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}