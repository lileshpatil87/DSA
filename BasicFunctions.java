public class BasicFunctions {
    public static void main(String[] args) {
        System.out.println("Factorial of 6 : " + factorial(6));
        System.out.println("Prime numbers from 1 to 100 : ");
        int arr[] = primesInRange(1, 100);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                break;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nDecimal of 10111 : " + binaryToDecimal(10111));
        System.out.println("Binary of 23 : " + decimalToBinary(23));
        System.out.println("12321 is Palindrome : " + palindrome(12321));
        System.out.println("Sum of digits of 1234 : " + sumOfDigits(1234));
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

    // Binary to Decimal
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int counter = 0;
        int digit = 0;

        while (binary > 0) {
            digit = binary % 10;
            decimal += Math.pow(2, counter++) * digit;
            binary /= 10;
        }
        return decimal;
    }

    // Decimal to Binary
    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int counter = 0;
        int remiander = 0;
        while (decimal > 0) {
            remiander = decimal % 2;
            binary = binary + remiander * (int) Math.pow(10, counter++);
            decimal /= 2;
        }
        return binary;
    }

    // Palindrome Number
    public static boolean palindrome(int number) {
        int revNumber = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            revNumber = revNumber * 10 + (tempNumber % 10);
            tempNumber /= 10;
        }
        if (revNumber == number)
            return true;
        return false;
    }

    // Sum of Digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}