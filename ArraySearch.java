public class ArraySearch {
    public static void main(String args[]) {
        int arr[] = { 5, 9, 7, 1, 6 };
        System.out.println("Linear Search to Find 7: " + linearSearch(arr, 7));
        arr = new int[] { 1, 5, 6, 7, 9 };
        System.out.println("Binary Search to Find 7: " + binarySearch(arr, 7));
    }

    // Linear Search
    // Time Complexity : O(n)
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search
    // Time Complexity O(log n)
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                end = mid - 1;
            if (arr[mid] < key)
                start = mid + 1;
        }
        return -1;
    }
}
