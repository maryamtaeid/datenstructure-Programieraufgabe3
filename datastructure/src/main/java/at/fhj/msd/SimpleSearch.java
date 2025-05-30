package at.fhj.msd;
public class SimpleSearch {

    /**
     * Linear Search algorithm
     * Goes through the array from start to end and returns the index of the target if found.
     * If not found, returns -1.
     *
     * @param a The array to search
     * @param x The target value to find
     * @return Index of x in a, or -1 if not found
     */
    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;  // Element found at index i
            }
        }
        return -1;  // Element not found
    }

    /**
     * Binary Search algorithm
     * Assumes that the array is sorted.
     * Repeatedly divides the search interval in half.
     *
     * @param a The sorted array to search
     * @param x The target value to find
     * @return Index of x in a, or -1 if not found
     */
    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Prevent overflow

            if (a[mid] == x) {
                return mid;  // Element found at mid
            } else if (a[mid] < x) {
                low = mid + 1;  // Search in right half
            } else {
                high = mid - 1;  // Search in left half
            }
        }
        return -1;  // Element not found
    }

    /**
     * Example test main method
     */
    public static void main(String[] args) {
        int[] testArray = {1, 3, 5, 7, 9, 11, 13};

        // Test linear search
        System.out.println("Linear Search for 7: " + linearSearch(testArray, 7));
        System.out.println("Linear Search for 2: " + linearSearch(testArray, 2));

        // Test binary search (array must be sorted!)
        System.out.println("Binary Search for 7: " + binarySearch(testArray, 7));
        System.out.println("Binary Search for 2: " + binarySearch(testArray, 2));
    }
}
