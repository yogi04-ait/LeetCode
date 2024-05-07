
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19}; // Primes up to 19

        int primeCount = 0;
        for (int i = left; i <= right; i++) {
            if (Arrays.binarySearch(primes, Integer.bitCount(i)) >= 0) {
                primeCount++;
            }
        }
        return primeCount;
    }
}
