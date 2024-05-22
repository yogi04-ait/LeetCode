class Solution {
    public int numberOfSteps(int num) {
        return helper(num);
        
    }
    
    public int helper(int num){
        if(num == 0){
            return 0;
        }
        
        if((num&1) == 1){
            return 1+ helper(num-1);
        }
        else{
            return 1 +  helper(num/2);
        }
    }
    
}