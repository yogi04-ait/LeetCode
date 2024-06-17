class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int)(Math.sqrt(c));
        
        while(a<=b){
            int num = (int)(Math.pow(a,2) + Math.pow(b,2));
            if(num == c ){
                return true;
            }
            
            if(num > c){
                b--;
            }else{
                a++;
            }
        }
        
        return false;
    }
}