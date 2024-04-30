class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] ans = new int[101];

        for(int[] log:logs){
            int by = log[0]-1950;
            int dy = log[1]-1950;
            ans[by]++;
            ans[dy]--;
        }

        int max = ans[0];
        int max_year = 1950;

        for(int i=1; i <101;i++){
            ans[i] += ans[i-1];
            if(max < ans[i]){
                max = ans[i];
                max_year = 1950+i;
            }
        }

        return max_year;
    }
}