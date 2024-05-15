class Solution {
    public void solveSudoku(char[][] board) {
        
        helper(board, 0, 0);
        
    }
    
    public boolean helper(char[][] board, int row, int col){
        
        if(row == board.length){
            return true;
        }
        
        if(col == board.length){
           return helper(board, row+1, 0);
        }
        
        
        if(board[row][col] != '.'){
            
           return helper(board, row, col+1);
              
            
        }else{
            
            for(int num=1; num<10;num++){  
                if(isValid(board, row , col, num)){
                    board[row][col] = (char)(num + '0');
                    if(helper(board, row, col+1)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }

                }
                
            }
                        
            
        }
        
        return false;
        
    }
    
    public boolean isValid(char[][] board, int row, int col, int num){
        
        char ch = (char) (num + '0');
        
        for(int i =0; i< board.length;i++){
            if(board[i][col] == ch){
                return false;
            }
        }
        
        for(int i =0; i< board.length;i++){
            if(board[row][i] == ch){
                return false;
            }
        }
        
        int sqt = (int)Math.sqrt(board.length);
        
        int rStart = row/sqt * sqt;
        int cStart = col/sqt * sqt;
        
        for(int i = rStart; i < rStart+sqt;i++){
            for(int j = cStart; j < cStart+sqt; j++){
                if(board[i][j] == ch){
                return false;
            }
            }
        }
        
        return true;
    }
}