class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
        
    }
    
    public int helper(int num, int count){
        if(num == 0){
            return count;
        }
        
        count++;
        if((num&1) == 1){
            return helper(num-1,count);
        }
        else{
            return helper(num/2,count);
        }
    }
    
}