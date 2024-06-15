class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        
        for(String word : dictionary ){
            int[] arr = new int[26];
            
            boolean isValid = true;
            int i =0, j =0;
            
            while(i < s.length() && j < word.length()){
                if(word.charAt(j)== s.charAt(i)){
                    j++;
                }
                i++;
            }
            
            if(j != word.length()){
                isValid = false;
            }
            
            
            
            
            if(isValid){
                if(word.length() > ans.length()){
                    ans = word;
                }
                else if(word.length() == ans.length()){
                    if(ans.compareTo(word) > 0){
                        ans = word;
                    }
                }
            }
        }
        
        return ans;
        
        
        
    }
}