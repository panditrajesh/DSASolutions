/*
 * Longest Consecutive Sequence in an Array
    Problem Statement: You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.
    The sequence is consecutive when adjacent elements of the sequence have a difference of 1.
 */

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 2, 3, 4 };
        int n = arr.length;

        int maximumLength = longestSequence(arr, n);
        System.out.println("Longest consecutive length of the array is: " + maximumLength);

    }

    public static int longestSequence(int[] arr, int n) {
        int length = 1;
        int lastElement = Integer.MIN_VALUE;
        int count = 0;
        // sort the array
        Arrays.sort(arr);
        // now iterate through the array
        for (int i = 0; i < n; i++) {
            // check if the current element is 1 greater than the last element.
            // if yes, then increase the count, and assign the current element as new last.
            // else set count as 1 and assign the current element as last
            if (arr[i] - 1 == lastElement) {
                count++;
                lastElement = arr[i];
            } else if (arr[i] != lastElement) {
                count = 1;
                lastElement = arr[i];
            }
            length = Math.max(length, count);
        }
        return length;
    }
}
