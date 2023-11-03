/*
 * Alternate Numbers: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. 
 * Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values
 * Note: Start the array with positive elements.
 * 
 * Brute force approach : 
 *      1. Create two array for both positive and negative numbers and put the elements on them respectively.
 *      2. Now put them on the original array, positive at the even index and negative at the odd index
 * 
 * Optimal Approach :
 *      1. Assign posIndex as 0 and negIndex as 1;
 *      2. Traverse through the array in a such a way that place first positive at 0 and then, whenever it gets positive elements, place it at positive incremented by 2 
 *      3. same for the negative
 * 
 */

public class AlternateNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5 };
        int n = arr.length;
        System.out.println("Array before alternation : ");
        printArray(arr);

        System.out.println("Array after alternation: ");
        int[] a = alternateNumbers(arr, n);
        printArray(a);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] alternateNumbers(int[] arr, int n) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }

}
