/* Time Complexity - O(n + sqrt(n)), Space Complexity O(n) */
class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        
        // Create a boolean array to mark numbers as prime or not
        boolean[] isPrime = new boolean[n];
        
        // Initialize all numbers greater than 2 as potential primes
        for (int i = 2; i < n; i++) 
            isPrime[i] = true;
        
        // Sieve of Eratosthenes algorithm to mark non-prime numbers
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of prime numbers as non-prime
                for (int j = i * i; j < n; j += i) 
                    isPrime[j] = false;
            }
        }

        int count = 0; // Variable to count the number of primes
        
        // Count the number of primes by iterating through the array
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) 
                count++;
        }
        
        return count;
    }
}


