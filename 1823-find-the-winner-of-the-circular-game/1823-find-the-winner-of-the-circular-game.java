class Solution {
    public int findTheWinner(int n, int k) {
        // Create a list representing the friends
        List<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }
        
        // Start position
        int index = 0;
        
        // Continue until only one friend remains
        while (friends.size() > 1) {
            // Calculate the next index to remove
            index = (index + k - 1) % friends.size();
            // Remove the friend at the calculated index
            friends.remove(index);
        }
        
        // The last remaining friend is the winner
        return friends.get(0);
    }

   
}
