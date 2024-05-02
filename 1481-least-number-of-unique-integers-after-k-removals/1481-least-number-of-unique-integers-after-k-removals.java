class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> freq  = new ArrayList<>();
        for(int i=0; i < arr.length; i++){
            int count =1;
            while((i+1) < arr.length && arr[i] == arr[i+1] ){
                count++;
                i++;
            }
            freq.add(count);
        }
        Collections.sort(freq);

        for(int i =0 ; i < freq.size(); i++){
            if(freq.get(i) <= k){
                k = k - freq.get(i);
            }
            else{
                return freq.size()-i;
            }
        }

        return 0;
    

    }
}