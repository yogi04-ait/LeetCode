class Solution {
    public int findDuplicate(int[] nums) {
        
        int index = 0;
        

        
        while(index < nums.length){
            int correctIndex = nums[index]-1;
            
            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else{
                index++;
            }
        }
        
        
        for(int i =0; i < nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        
        return -1;
        
    }
    
    public  void swap(int[] nums, int I1, int I2){
            int temp = nums[I1];
            nums[I1] = nums[I2];
            nums[I2] = temp;
        }
}