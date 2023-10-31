/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 12, 34, 45, 11, 78, 90 };
        int targetValue = 45;
        int index = linearSearch(arr, targetValue);
        System.out.println("The index of the target element is: " + index);
    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}