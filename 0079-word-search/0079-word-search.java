class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        // Start DFS from each cell
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (helper(board, visited, row, col, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, boolean[][] visited, int row, int col, String word, int index) {
        // Base case: If all characters are found
        if (index == word.length()) {
            return true;
        }

        // Boundary and state checks
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
            visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited
        visited[row][col] = true;

        // Explore all possible directions (up, down, left, right)
        boolean found = helper(board, visited, row + 1, col, word, index + 1) ||
                        helper(board, visited, row - 1, col, word, index + 1) ||
                        helper(board, visited, row, col + 1, word, index + 1) ||
                        helper(board, visited, row, col - 1, word, index + 1);

        // Unmark the cell as visited (backtracking)
        visited[row][col] = false;

        return found;
    }
}
