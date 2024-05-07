class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int carry = (n & 1); 
        n >>= 1;
        
        while(n !=0){
            if(carry != (n&1)){
                carry = n&1;
                n >>=1;
            }else{
                return false;
            }
        }
        
        
        return true;
        
        
            
        
    }
}