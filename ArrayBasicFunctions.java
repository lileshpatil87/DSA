import java.util.Arrays;

public class ArrayBasicFunctions {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 2, 6, 3, 7 };
        arrayReverse(arr);
        System.out.println("Reverse of [1,4,2,6,3,7] : " + Arrays.toString(arr));
        int pairs[][] = pairsInArray(arr);
        System.out.println("Pairs in the array : ");
        for (int i = 0; i < pairs.length; i++) {
            System.out.print(Arrays.toString(pairs[i]) + " ");
        }
        System.out.println("\nAll Substrings in the array : ");
        allSubstrings(arr);
        System.out.println("Max Subarray Sum in the array : " + maxSubarraySum(arr));
        System.out.println("Max Subarray Sum in the array using Prefix Sum : " + prefixSum(arr));
    }

    // Array Reverse
    // Time Complexity O(n) / O(n/2) => O(n)
    public static void arrayReverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Pairs in Array
    // Time Complexity O(n^2)
    public static int[][] pairsInArray(int arr[]) {
        int pairs[][] = new int[arr.length * (arr.length - 1) / 2][2];
        int pairsCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pairs[pairsCounter++] = new int[] { arr[i], arr[j] };
            }
        }
        return pairs;
    }

    // All Substrings in an array
    // Time Complexity O(n^3)
    public static void allSubstrings(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k != j) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
            }
            System.out.println();
        }
        System.out.println("[]");
    }

    // Max Subarray
    // Time Complexity O(n^3)
    public static int maxSubarraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        ;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        return max;
    }

    // Prefix Sum
    // Time Complexity O(n^2)
    public static int prefixSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int prefixArr[] = new int[arr.length];
        prefixArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;

    }
}