package ch_01_arrays;

public class Array {

    /*
     * Linear Search
     */
    public static boolean find(int[] array, int size, int keyToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == keyToSearch) {
                return true;
            }
        }

        return false;
    }

    /*
     * Count 0's and 1's
     */
    public static int[] countZeroOne(int[] arr, int size) {
        int countZero = 0, countOne = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }

            if (arr[i] == 1) {
                countOne++;
            }
        }

        int[] result = { countOne, countZero };

        return result;
    }

    /*
     * Maximum Number in an array
     */
    public static int findMax(int[] arr, int size) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    /*
     * Minimum Number in an array
     */
    public static int findMin(int[] arr, int size) {
        int mimNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mimNumber) {
                mimNumber = arr[i];
            }
        }
        return mimNumber;
    }

    /*
     * print Extreme element in an array
     * two pointer approach
     */
    public static void printExtreme(int[] arr, int size) {
        int start = 0, end = size;
        while (start <= end) {
            if (start == end) {
                System.out.println(arr[end]);
            } else {
                System.out.println(arr[start]);
                System.out.println(arr[end]);
            }
            start++;
            end--;
        }
    }

    /*
     * Reverse an array
     */
    public static void reverseArray(int[] arr, int size) {
        int start = 0, end = size;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*
     * Print arrays
     */
    public static void printArrays(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // int[] arr = { 10, 02, 30, 40, 121, 303 };
        // System.out.println(find(arr, 5, 303));

        // int[] arr = { 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 2 };
        // for (int i : countZeroOne(arr, arr.length)) {
        // System.out.println(i);
        // }

        // System.out.println(findMax(arr, arr.length));
        // System.out.println(findMin(arr, arr.length));

        int[] arr = { 10, 20, 30, 40, 50 };
        // printExtreme(arr, arr.length - 1);
        reverseArray(arr, arr.length - 1);
        printArrays(arr, arr.length - 1);

    }
}
