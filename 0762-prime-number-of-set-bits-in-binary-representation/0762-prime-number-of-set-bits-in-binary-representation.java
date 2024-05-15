import java.util.Arrays;

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19}; // Primes up to 19

        int primeCount = 0;
        for (int i = left; i <= right; i++) {
            int bits = i; // Preserve the original number
            int digits = 0;

            while (bits != 0) {
                digits += bits & 1; // Count the number of 1s
                bits >>= 1; // Shift bits to the right
            }
            
            if (Arrays.binarySearch(primes, digits) >= 0) {
                primeCount++;
            }
        }
        return primeCount;
    }

    
}
