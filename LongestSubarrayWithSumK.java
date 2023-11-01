/*
 * Given an array and a sum k, we need to print the length of the longest subarray sum that is equal to k.
 */

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 5 };
        int k = 5;
        int longestLength = longestSubarraySum(arr, k);
        System.out.println("The length of the longest subarray with equal to the given sum is: " + longestLength);
    }

    public static int longestSubarraySum(int[] arr, int k) {
        // two pointer approach
        int left = 0;
        int right = 0;

        int maxLen = 0; // maximum length of the subarray
        int sum = arr[0]; // assign the first element of the array as the sum
        int n = arr.length;
        // run a loop until the right pointer is lesser than the length of the array to
        // traverse all the elements
        while (right < n) {

            // when the sum is greater than given k, then subtract left element from the sum
            // and increase the sum pointer
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // if sum == k, then calculate the length
            if (sum == k) {
                maxLen = Math.max(maxLen, (right - left) + 1);
            }

            // increase the right pointer
            right++;
            // until the right is less than the length of the array, add the elements with
            // sum
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLen;
    }
}
