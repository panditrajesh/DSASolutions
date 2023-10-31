/**
 * LinearSearch : Given an array and a target value. You need to write a method,
 * if the targetvalue is present in the array or not.
 * if present, return index of that element
 * else, return -1
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 12, 34, 45, 11, 78, 90 };
        int targetValue = 452;
        int index = linearSearch(arr, targetValue);
        if (index == -1) {
            System.out.println("The element is not present in the array.");
        } else {
            System.out.println("The index of the target element is: " + index);
        }
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