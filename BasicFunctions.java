public class BasicFunctions {
    public static void main(String[] args) {
        System.out.println("Factorial of 6 : " + factorial(6));
        System.out.println("Prime numbers from 1 to 100 : ");
        int arr[] = primesInRange(1, 100);
        for( int i=0;i< arr.length;i++ ) {
            if(arr[i] == 0) break;
            System.out.print(arr[i]+" ");
        }
    }

    // Factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    // Find prime numbers in a specific range
    public static int[] primesInRange(int start, int end) {
        int primes[] = new int[end - start];
        boolean isPrime = true;
        int counter = 0;

        for (int i = start; i < end; i++) {
            if (i == 1) {
                primes[counter++] = 1;
                continue;
            }
            if (i == 2) {
                primes[counter++] = 2;
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes[counter++] = i;
            isPrime = true;
        }
        return primes;
    }
}
