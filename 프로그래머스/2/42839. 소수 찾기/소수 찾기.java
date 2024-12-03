import java.util.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> primes = new HashSet<>();
        
        // Generate all permutations of the numbers
        generatePermutations("", numbers, primes);

        // Count the primes
        int count = 0;
        for (int num : primes) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }
    
    private void generatePermutations(String prefix, String remaining, Set<Integer> primes) {
        if (!prefix.isEmpty()) {
            primes.add(Integer.parseInt(prefix));
        }

        for (int i = 0; i < remaining.length(); i++) {
            generatePermutations(prefix + remaining.charAt(i),
                                  remaining.substring(0, i) + remaining.substring(i + 1),
                                  primes);
        }
    }
    
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}